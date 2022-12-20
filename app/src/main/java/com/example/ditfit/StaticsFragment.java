package com.example.ditfit;



import static com.example.ditfit.user.SignUpActivity.userBoard;
import static com.example.ditfit.user.SignUpActivity.userClass;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ditfit.databinding.FragmentStaticsBinding;
import com.example.ditfit.user.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class StaticsFragment extends Fragment {
    private FragmentStaticsBinding binding;

    FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
//    Button WriteButton;
//    ListView mainListView;
//    ListAdapter listAdapter = null;
    CalendarView calendar;
    Button SelectButton;
    TextView textView1,textView2,textView3,textView4,textView5,
            Select_Day_Exercise,Select_Day_Kg,Select_Day_Number,Select_Day_Set,Select_Day_WalkCount;
    String Year, Month, Day;
    String Exercise, kg, num, set, walk;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStaticsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser();
        calendar = binding.calendarView;
        SelectButton = binding.selectDayButton;
        textView1 = binding.textView1;
        textView2 = binding.textView2;
        textView3 = binding.textView3;
        textView4 = binding.textView4;
        textView5 = binding.textView5;
        Select_Day_Exercise = binding.selectDayExercise;
        Select_Day_Kg = binding.selectDayKg;
        Select_Day_Number = binding.selectDayNumber;
        Select_Day_Set = binding.selectDaySet;
        Select_Day_WalkCount = binding.selectDayWalkCount;

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                Year = Integer.toString(year);
                Month = Integer.toString(month+1);
                Day = Integer.toString(dayOfMonth);
            }
        });
//        mainListView = binding.listMainListView;
//        WriteButton = binding.writeButton;
//        listAdapter = new ListAdapter(); // 객체 주입
//
//        WriteButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),WriteActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        getBoard();
        SelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDatabase.getReference().child("Users").child(user.getUid()).child("Exercise").child(Year).child(Month).child(Day).addValueEventListener(new ValueEventListener() {
                    @Override   //유저 이름 가져오기, child는 데이터베이스의 테이블 이름을 의미함.
                    // 이 코드의 경우에는 Users안의 uid안의 Name테이블에 있는 데이터값을 가지고 옴
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        User user = snapshot.getValue(User.class);
                        if(snapshot.exists()){
                            textView1.setVisibility(View.VISIBLE);
                            textView2.setVisibility(View.VISIBLE);
                            textView3.setVisibility(View.VISIBLE);
                            textView4.setVisibility(View.VISIBLE);
                            textView5.setVisibility(View.VISIBLE);
                            Select_Day_Exercise.setVisibility(View.VISIBLE);
                            Select_Day_Kg.setVisibility(View.VISIBLE);
                            Select_Day_Set.setVisibility(View.VISIBLE);
                            Select_Day_Number.setVisibility(View.VISIBLE);
                            Select_Day_WalkCount.setVisibility(View.VISIBLE);
                            Exercise = user.getExercise();
                            kg = user.getKg();
                            set = user.getSet();
                            num = user.getNumber();
                            walk = user.getWalk();
                            Select_Day_Exercise.setText(Exercise);
                            Select_Day_Kg.setText(kg);
                            Select_Day_Set.setText(set);
                            Select_Day_Number.setText(num);
                            Select_Day_WalkCount.setText(walk);
                        }else{
                            textView1.setVisibility(View.INVISIBLE);
                            textView2.setVisibility(View.INVISIBLE);
                            textView3.setVisibility(View.INVISIBLE);
                            textView4.setVisibility(View.INVISIBLE);
                            textView5.setVisibility(View.INVISIBLE);
                            Select_Day_Exercise.setText("이 날은 운동하지않았습니다!");
                            Select_Day_Kg.setVisibility(View.INVISIBLE);
                            Select_Day_Set.setVisibility(View.INVISIBLE);
                            Select_Day_Number.setVisibility(View.INVISIBLE);
                            Select_Day_WalkCount.setVisibility(View.INVISIBLE);
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

        return root;
    }
//
//    public void getBoard() { // 원래는 텍스트하고 포토 하고 구분을 할려고 했는데 일단 text만 따로 뽑기로 하겠습니다
////        Board board = userBoard;
//        mDatabase.getReference().child("Board").addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                Map<String, String> map = (Map) dataSnapshot.getValue();
//                mainListView.setAdapter(listAdapter);
//
//
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    Board board = snapshot.getValue(Board.class);
//                    listAdapter.addItem(board.getTitle(), board.getDate(), board.getName());
//
//                }
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//
//        });
//
//    }
//    public interface Callback{
//        void success(String data);
//        void fail(String errorMessage);
//    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}