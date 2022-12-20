package com.example.ditfit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;

public class HealthAddActivity extends AppCompatActivity {

    String ExerciseName="";
    int year, month, day;
    String Year, Month, Day;
    Button addbutton;
    EditText set,kg,number;

    private FirebaseAuth mAuth;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_add);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        addbutton = (Button)findViewById(R.id.addbutton);
        set = (EditText)findViewById(R.id.set);
        kg = (EditText)findViewById(R.id.kg);
        number = (EditText)findViewById(R.id.number);

        Calendar startDate = Calendar.getInstance(); //시작날짜
        startDate.add(Calendar.MONTH,-1);

        Calendar endDate = Calendar.getInstance(); //종료날짜(현재날짜 + 1달 후)
        endDate.add(Calendar.MONTH,1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(HealthAddActivity.this, R.id.calendarView)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .build();

        //날짜 설정
        year = startDate.get(Calendar.YEAR); //년
        month = startDate.get(Calendar.MONTH)+1; //월
        day = startDate.get(Calendar.DAY_OF_MONTH); //일

        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener() {
            @Override
            public void onDateSelected(Calendar date, int position) {
                year = date.get(Calendar.YEAR);
                month = date.get(Calendar.MONTH)+1;
                day = date.get(Calendar.DAY_OF_MONTH);
                Year = String.valueOf(year);
                Month = String.valueOf(month);
                Day = String.valueOf(day);
            }
        });

        Intent intent = getIntent();
        ExerciseName = intent.getStringExtra("ExerciseName");
        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser(); //현재 로그인한 사용자 가져오기
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("Users").child(user.getUid().toString()).child("Exercise")
                        .child(Year).child(Month).child(Day).child(ExerciseName).child("Set").setValue(set.getText().toString());
                databaseReference.child("Users").child(user.getUid().toString()).child("Exercise")
                        .child(Year).child(Month).child(Day).child(ExerciseName).child("Kg").setValue(kg.getText().toString());
                databaseReference.child("Users").child(user.getUid().toString()).child("Exercise")
                        .child(Year).child(Month).child(Day).child(ExerciseName).child("Number").setValue(number.getText().toString());
                finish();
            }
        });

    }
}