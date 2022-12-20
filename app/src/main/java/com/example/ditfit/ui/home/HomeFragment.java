package com.example.ditfit.ui.home;

import static android.content.Context.ALARM_SERVICE;

import android.Manifest;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import com.example.ditfit.AddWalkCount;
import com.example.ditfit.R;
import com.example.ditfit.WalkCount;
import com.example.ditfit.user.Login;
import com.example.ditfit.databinding.FragmentHomeBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import android.app.Application;

public class HomeFragment extends Fragment implements SensorEventListener{

    private FragmentHomeBinding binding;
    private HomeViewModel homeViewModel;
    private FirebaseAuth mAuth;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabase = database.getReference();


    Button Login;
    Button MoveHealth;
    Button MoveLocation;
    Button MoveCalender;
    Button resetButton;
    TextView StepCountView;
    private SensorManager sensorManger;
    private Sensor stepCountSensor;

    //private int currentSteps = 0;
    //리스너가 등록되고 난 후의 step count
    //private int mCounterSteps = 0;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Login = binding.Login;
        MoveHealth = binding.button;
        MoveLocation = binding.button2;
        MoveCalender = binding.button3;
        StepCountView = (TextView) root.findViewById(R.id.tvStepCountview);
//        resetButton = (Button) root.findViewById(R.id.resetButton);

        /*final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }               ***** 이런식으로 쓰면될듯
        });*/
        //youtube = (YouTubePlayer)root.findViewById(R.id.youtube_player_view);

        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        NavOptions options = new NavOptions.Builder() //나오는 위젯 속도 조절
                .setEnterAnim(R.anim.fade_in)
                .setExitAnim(R.anim.fade_out)
                .setPopEnterAnim(R.anim.fade_in)
                .setPopExitAnim(R.anim.fade_out)
                .build();



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Login.class);
                startActivity(intent);
            }
        });

        MoveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.navigation_dashboard,null,options);
            }
        });

        MoveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.navigation_notifications,null,options);
            }
        });

        MoveCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.navigation_statics,null,options);
            }
        });

        if(ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACTIVITY_RECOGNITION) == PackageManager.PERMISSION_DENIED){
            requestPermissions(new String[]{Manifest.permission.ACTIVITY_RECOGNITION},0);
        }

        // 걸음 센서 연결
        // * 옵션
        // - TYPE_STEP_DETECTOR:  리턴 값이 무조건 1, 앱이 종료되면 다시 0부터 시작
        // - TYPE_STEP_COUNTER : 앱 종료와 관계없이 계속 기존의 값을 가지고 있다가 1씩 증가한 값을 리턴
        //

        sensorManger = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);
        stepCountSensor = sensorManger.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

        // 디바이스에 걸음 센서의 존재 여부 체크
        if (stepCountSensor == null) {
            Toast.makeText(getActivity(), "No Step Sensor", Toast.LENGTH_SHORT).show();
        }

        // 리셋 버튼 추가 - 리셋 기능
//        resetButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 현재 걸음수 초기화
//                WalkCount.currentSteps = 0;
//                WalkCount.mCounterSteps = 0;
//                StepCountView.setText(String.valueOf(WalkCount.currentSteps));
//            }
//        });

        AlarmManager resetAlarmManager = (AlarmManager)getActivity().getSystemService(ALARM_SERVICE);
        Intent resetIntent = new Intent(getActivity(), AddWalkCount.class);
        PendingIntent resetSender = PendingIntent.getBroadcast(getActivity(), 0, resetIntent, PendingIntent.FLAG_MUTABLE);

        // 자정 시간
        Calendar resetCal = Calendar.getInstance();
        resetCal.setTimeInMillis(System.currentTimeMillis());
        resetCal.set(Calendar.HOUR_OF_DAY, 0);
        resetCal.set(Calendar.MINUTE,0);
        resetCal.set(Calendar.SECOND, 0);

        //다음날 0시에 맞추기 위해 24시간을 뜻하는 상수인 AlarmManager.INTERVAL_DAY를 더해줌.
        resetAlarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, resetCal.getTimeInMillis()
                +AlarmManager.INTERVAL_DAY, AlarmManager.INTERVAL_DAY, resetSender);



        return root;
    }


    @Override
    public void onStart() {
        super.onStart();
        if(stepCountSensor != null){
            // 센서 속도 설정
            // * 옵션
            // - SENSOR_DELAY_NORMAL: 20,000 초 딜레이
            // - SENSOR_DELAY_UI: 6,000 초 딜레이
            // - SENSOR_DELAY_GAME: 20,000 초 딜레이
            // - SENSOR_DELAY_FASTEST: 딜레이 없음
            //
            sensorManger.registerListener(this,stepCountSensor,SensorManager.SENSOR_DELAY_FASTEST);
        }
    }
    @Override
    public void onStop() {
        super.onStop();
        if(sensorManger!=null){
            sensorManger.unregisterListener(this);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if(sensorEvent.sensor.getType() == Sensor.TYPE_STEP_COUNTER){

            //stepcountsenersor는 앱이 꺼지더라도 초기화 되지않는다. 그러므로 우리는 초기값을 가지고 있어야한다.
            if (WalkCount.mCounterSteps < 1) {
                // initial value
                WalkCount.mCounterSteps = (int) sensorEvent.values[0];
            }
            //리셋 안된 값 + 현재값 - 리셋 안된 값
            WalkCount.currentSteps = (int) sensorEvent.values[0] - WalkCount.mCounterSteps;
            StepCountView.setText(Integer.toString(WalkCount.currentSteps));
            Log.i("log: ", "New step detected by STEP_COUNTER sensor. Total step count: " + WalkCount.currentSteps );
        }

        // 걸음 센서 이벤트 발생시
        if(sensorEvent.sensor.getType() == Sensor.TYPE_STEP_COUNTER){
            if(sensorEvent.values[0] == 1.0f){
                // 센서 이벤트가 발생할때 마다 걸음수 증가
                WalkCount.currentSteps++;
                StepCountView.setText(String.valueOf(WalkCount.currentSteps));
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}