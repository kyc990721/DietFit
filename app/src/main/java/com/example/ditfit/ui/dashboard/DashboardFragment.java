package com.example.ditfit.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ditfit.HealthAddActivity;
import com.example.ditfit.HealthVideoActivity;
import com.example.ditfit.R;
import com.example.ditfit.databinding.FragmentDashboardBinding;
import com.example.ditfit.user.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;

public class DashboardFragment extends Fragment {

    String NameofExercise = "";
    private FirebaseAuth mAuth;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = database.getReference();
    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;
//    CalendarView calendarView;
//    TextView textView;
//    Button workoutPlan;

//    //현재 날짜
//    public static String getCurrentDate() {
//        Date dateNow = Calendar.getInstance().getTime();
//        SimpleDateFormat format = new SimpleDateFormat("M월 dd일", Locale.getDefault());
//        Calendar calendar = Calendar.getInstance();
//        return format.format(dateNow);
//    }
    int year, month, day;
    SearchView search;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    RadioGroup radioGroup;
    RadioButton rdoshoulder;
    RadioButton rdoarm;
    RadioButton rdochest;
    RadioButton rdoback;
    RadioButton rdoabs;
    RadioButton rdoleg;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//        calendarView = binding.calendarView;
//        textView = binding.selectedDayOfMonth;
//        workoutPlan = binding.WokoutPlan;

//        textView.setText(getCurrentDate());

//        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
//                    textView.setText(month+1+"월 "+dayOfMonth+"일");
//
//            }
//        });
//        workoutPlan.setOnClickListener(new View.OnClickListener() { //임시
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), WorkoutPlanChoose.class);
//                startActivity(intent);
//            }
//        });



//        final TextView textView = binding.textDashboard;
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        search = (SearchView)root.findViewById(R.id.health_search);
        btn1 = (Button)root.findViewById(R.id.btn1);
        btn2 = (Button)root.findViewById(R.id.btn2);
        btn3 = (Button)root.findViewById(R.id.btn3);
        btn4 = (Button)root.findViewById(R.id.btn4);
        btn5 = (Button)root.findViewById(R.id.btn5);
        btn6 = (Button)root.findViewById(R.id.btn6);
        btn7 = (Button)root.findViewById(R.id.btn7);
        btn8 = (Button)root.findViewById(R.id.btn8);
        btn9 = (Button)root.findViewById(R.id.btn9);
        btn10 = (Button)root.findViewById(R.id.btn10);
        btn11 = (Button)root.findViewById(R.id.btn11);
        btn12 = (Button)root.findViewById(R.id.btn12);
        btn13 = (Button)root.findViewById(R.id.btn13);
        btn14 = (Button)root.findViewById(R.id.btn14);
        btn15 = (Button)root.findViewById(R.id.btn15);
        radioGroup = (RadioGroup) root.findViewById(R.id.radiogroup);
        rdoshoulder = (RadioButton) root.findViewById(R.id.rdoshoulder);
        rdoabs = (RadioButton) root.findViewById(R.id.rdoabs);
        rdochest = (RadioButton) root.findViewById(R.id.rdochest);
        rdoback = (RadioButton) root.findViewById(R.id.rdoback);
        rdoleg = (RadioButton) root.findViewById(R.id.rdoleg);
        rdoarm = (RadioButton) root.findViewById(R.id.rdoarm);




        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                // 검색버튼이 눌러졌을때 이벤트 처리
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                // 검색어가 변경되었을때 이벤트 처리
                return false;
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(rdoshoulder.isChecked()){

                    btn11.setVisibility(View.VISIBLE);
                    btn12.setVisibility(View.VISIBLE);
                    btn13.setVisibility(View.VISIBLE);
                    btn14.setVisibility(View.VISIBLE);
                    btn15.setVisibility(View.VISIBLE);
                    btn1.setText("스탠딩 밀리터리 프레스");
                    btn2.setText("시티드 밀리터리 프레스");
                    btn3.setText("푸쉬 프레스");
                    btn4.setText("원 암 리니어 재머");
                    btn5.setText("클린 앤 프레스");
                    btn6.setText("클린 앤 저크");
                    btn7.setText("브래드포드 프레스");
                    btn8.setText("바벨 후사면 로우");
                    btn9.setText("전면 레이즈");
                    btn10.setText("측면 레이즈");
                    btn11.setText("시티드 덤벨 프레스");
                    btn12.setText("스탠딩 덤벨 프레스");
                    btn13.setText("아놀드 프레스");
                    btn14.setText("덤벨 인클라인 어깨 레이즈");
                    btn15.setText("인클라인 측면 레이즈");
                }
                else if(rdochest.isChecked()){
                    btn11.setVisibility(View.VISIBLE);
                    btn12.setVisibility(View.VISIBLE);
                    btn13.setVisibility(View.VISIBLE);
                    btn14.setVisibility(View.VISIBLE);
                    btn15.setVisibility(View.VISIBLE);
                    btn1.setText("디클라인 푸쉬업");
                    btn2.setText("플랫 푸쉬업");
                    btn3.setText("인클라인 푸쉬업");
                    btn4.setText("중량 푸쉬업");
                    btn5.setText("플로어 덤벨 프레스");
                    btn6.setText("디클라인 벤치프레스");
                    btn7.setText("플랫 벤치프레스");
                    btn8.setText("인클라인 벤치프레스");
                    btn9.setText("디클라인 덤벨프레스");
                    btn10.setText("플랫 덤벨프레스");
                    btn11.setText("인클라인 덤벨프레스");
                    btn12.setText("로우 케이블 플라이");
                    btn13.setText("미들 케이블플라이");
                    btn14.setText("풀오버");
                    btn15.setText("딥스");
                }
                else if(rdoarm.isChecked()){
                    btn11.setVisibility(View.VISIBLE);
                    btn12.setVisibility(View.VISIBLE);
                    btn13.setVisibility(View.VISIBLE);
                    btn14.setVisibility(View.VISIBLE);
                    btn15.setVisibility(View.VISIBLE);
                    btn1.setText("바벨컬");
                    btn2.setText("해머컬");
                    btn3.setText("덤벨컬");
                    btn4.setText("오버헤드 케이블 컬");
                    btn5.setText("컨센트레이션 컬");
                    btn6.setText("리버스 컬");
                    btn7.setText("드래그컬");
                    btn8.setText("라잉 케이블 컬");
                    btn9.setText("스탠딩 트라이셉 로프 익스텐션");
                    btn10.setText("클로즈그립 벤치 프레스");
                    btn11.setText("벤치딥스");
                    btn12.setText("딥스");
                    btn13.setText("오버헤드 트라이셉 익스텐션");
                    btn14.setText("라잉 트라이셉 익스텐션");
                    btn15.setText("킥백");
                }
                else if(rdoback.isChecked()){
                    btn11.setVisibility(View.VISIBLE);
                    btn12.setVisibility(View.VISIBLE);
                    btn13.setVisibility(View.VISIBLE);
                    btn1.setText("풀업");
                    btn2.setText("친업");
                    btn3.setText("랫풀다운");
                    btn4.setText("바벨로우");
                    btn5.setText("원암로우");
                    btn6.setText("투암로우");
                    btn7.setText("시티드로우");
                    btn8.setText("풀오버");
                    btn9.setText("티바로우");
                    btn10.setText("펜들레이 로우");
                    btn11.setText("인버티드로우");
                    btn12.setText("데드리프트");
                    btn13.setText("하이퍼익스텐션");
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                }
                else if(rdoleg.isChecked()){
                    btn11.setVisibility(View.VISIBLE);
                    btn12.setVisibility(View.VISIBLE);
                    btn13.setVisibility(View.VISIBLE);
                    btn14.setVisibility(View.VISIBLE);
                    btn15.setVisibility(View.VISIBLE);
                    btn1.setText("레그프레스");
                    btn2.setText("스쿼트");
                    btn3.setText("프론트스쿼트");
                    btn4.setText("런지");
                    btn5.setText("피스톨 스쿼트");
                    btn6.setText("스티프 레그 데드리프트");
                    btn7.setText("프론 레그컬");
                    btn8.setText("시티드 레그컬");
                    btn9.setText("굿모닝");
                    btn10.setText("스미스 머신 카프레이즈");
                    btn11.setText("시티드 카프레이즈");
                    btn12.setText("레그프레스 카프프레스");
                    btn13.setText("바벨 브릿지");
                    btn14.setText("바벨 힙 스러스트");
                    btn15.setText("싱글 레그 브릿지");
                }
        /*else if(rdobody.isChecked()){

        }*/
                else if(rdoabs.isChecked()){
                    btn1.setText("플랭크");
                    btn2.setText("AB 슬라이드");
                    btn3.setText("랫풀다운");
                    btn4.setText("푸쉬업");
                    btn5.setText("데드리프트");
                    btn6.setText("스쿼트");
                    btn7.setText("윗몸일으키기");
                    btn8.setText("슈퍼맨");
                    btn9.setText("L자앉기");
                    btn10.setText("드래곤 플래그");
                    btn11.setVisibility(View.INVISIBLE);
                    btn12.setVisibility(View.INVISIBLE);
                    btn13.setVisibility(View.INVISIBLE);
                    btn14.setVisibility(View.INVISIBLE);
                    btn15.setVisibility(View.INVISIBLE);
                }
            }
        });

        rdoshoulder.setChecked(true);

         /*
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomeTrainingPartsActivity.class);
                startActivity(intent);
            }
        });
        */


        /*final TextView textView = binding.textDashboard;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser(); //현재 로그인한 사용자 가져오기

        Intent intent = new Intent(getActivity(), HealthVideoActivity.class);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn1.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn2.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn3.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn4.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn5.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn6.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn7.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn8.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn9.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn10.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn11.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn12.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn13.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn14.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameofExercise = (String) btn15.getText();
                intent.putExtra("ExerciseName",NameofExercise);
                startActivity(intent);
            }
        });











    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}