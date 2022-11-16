package com.example.ditfit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

public class EditActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editactivity);

        final EditText edit_age = (EditText) findViewById(R.id.edit_age);
        final EditText edit_name = (EditText)  findViewById(R.id.edit_name);
        final EditText edit_height = (EditText)  findViewById(R.id.edit_height);
        final EditText edit_weight = (EditText)  findViewById(R.id.edit_weight);
        final EditText edit_waistEdit_enable = (EditText)  findViewById(R.id.edit_waistEdit_enable);
        final EditText edit_hipEdit_enable = (EditText)  findViewById(R.id.edit_hipEdit_enable);
        final Button edit_startBtn = (Button) findViewById(R.id.edit_startBtn);
        final RadioGroup gender = (RadioGroup) findViewById(R.id.gender);



     /*   edit_startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //입력 사항 중에 빈값 있는지 체크 : 전체 다 값이 입력되어야 데이터 저장
                if (edit_age.getText().length() != 0 &&
                        edit_height.getText().length() != 0 &&
                        edit_weight.length() != 0 &&
                        edit_waistEdit_enable.getText().length() != 0 &&
                        edit_hipEdit_enable.getText().length() != 0) {

                    *//*
                    입력 사항 값이 올바르지 않으면 오류메세지 보여주기
                    값 올바르게 저장되면 오류메세지 숨기기
                    *//*
*//* ****일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*****
                    //이름 : 비어있으면 "홍길동" 기본값 설정
                    if (edit_name.getText().toString() == null || edit_name.getText().toString().length() == 0) {
                        edit_name.setText("홍길동");
                    }

                    //나이 : 0세 이상 200세 미만
                    if (Integer.parseInt(edit_age.getText().toString()) < 0 ||
                            Integer.parseInt(edit_age.getText().toString()) > 200) {
                        setErrorTextVisible(ageErrorText);
                    } else {
                        setErrorTextHidden(ageErrorText);
                    }

                    //키 : 50cm 이상 250cm 미만
                    if (Integer.parseInt(edit_height.getText().toString()) < 50 ||
                            Integer.parseInt(edit_height.getText().toString()) > 250) {
                        setErrorTextVisible(heightErrorText);
                    } else {
                        setErrorTextHidden(heightErrorText);
                    }

                    //몸무게 : 10kg 이상 300kg 미만
                    if (Integer.parseInt(edit_weight.getText().toString()) < 10 ||
                            Integer.parseInt(edit_weight.getText().toString()) > 300) {
                        setErrorTextVisible(weightErrorText);
                    } else {
                        setErrorTextHidden(weightErrorText);
                    }

                    //허리둘레 : 5인치 이상 80인치 이하
                    if ((Integer.parseInt(edit_waistEdit_enable.getText().toString())) < 5 ||
                            (Integer.parseInt(edit_waistEdit_enable.getText().toString())) > 80) {
                        setErrorTextVisible(waistErrorText);
                    } else {
                        setErrorTextHidden(waistErrorText);
                    }

                    //엉덩이둘레 : 5인치 이상 80인치 이하
                    if ((Integer.parseInt(edit_hipEdit_enable.getText().toString())) < 5 ||
                            (Integer.parseInt(edit_hipEdit_enable.getText().toString())) > 80) {
                        setErrorTextVisible(hipErrorText);
                    } else {
                        setErrorTextHidden(hipErrorText);
                    }            ****일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)***** *//*

                    //모든값이 충족
                    if (Integer.parseInt(edit_age.getText().toString()) != 0 &&
                            Integer.parseInt(edit_height.getText().toString()) >= 50 &&
                            Integer.parseInt(edit_height.getText().toString()) <= 250 &&
                            Integer.parseInt(edit_weight.getText().toString()) >= 10 &&
                            Integer.parseInt(edit_weight.getText().toString()) <= 300 &&
                            Integer.parseInt(edit_waistEdit_enable.getText().toString()) >= 5 &&
                            Integer.parseInt(edit_waistEdit_enable.getText().toString()) <= 80 &&
                            Integer.parseInt(edit_hipEdit_enable.getText().toString()) >= 5 &&
                            Integer.parseInt(edit_hipEdit_enable.getText().toString()) <= 80) {

                        //currentDateandTime : 저장한 현재시간 저장 ****일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*********일단 숨겨두기(종민)*****
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
                        String currentDateandTime = sdf.format(new Date());

                        //모든 값이 충족이 되었을때 : userData에 데이터 값 입력하기
                        userData = new UserData(
                                edit_name.getText().toString(),
                                genderValue,
                                Integer.parseInt(edit_age.getText().toString()),
                                Integer.parseInt(edit_height.getText().toString()),
                                Integer.parseInt(edit_weight.getText().toString()),
                                Integer.parseInt(edit_waistEdit_enable.getText().toString()),
                                Integer.parseInt(edit_hipEdit_enable.getText().toString()),
                                activeValue,
                                currentDateandTime);

                        //listDataArrayList에서 항상 마지막 데이터만 값 보여주기
                        if (listDataArrayList.size() > 0) {
                            int listSize = listDataArrayList.size() - 1;

                            //listDataArrayList에서 이전값과 현재값이 중복되는지 확인
                            if (listDataArrayList.get(listSize).getmName().equals(userData.getmName()) &&
                                    listDataArrayList.get(listSize).getmGender() == userData.getmGender() &&
                                    listDataArrayList.get(listSize).getmAge() == userData.getmAge() &&
                                    listDataArrayList.get(listSize).getmHeight() == userData.getmHeight() &&
                                    listDataArrayList.get(listSize).getmWeight() == userData.getmWeight() &&
                                    listDataArrayList.get(listSize).getmWaist() == userData.getmWaist() &&
                                    listDataArrayList.get(listSize).getmHip() == userData.getmHip() &&
                                    listDataArrayList.get(listSize).getmActive() == userData.getmActive() &&
                                    listDataArrayList.get(listSize).getmDate().equals(userData.getmDate())) {
                                Toast.makeText(getApplicationContext(), "이전 정보로 시작합니다.", Toast.LENGTH_SHORT).show();
                            } else {
                                //listDataArrayList에서 이전값과 현재값이 중복되는값이 없으면 새로운값 저장
                                Toast.makeText(getApplicationContext(), "새로운 정보로 시작합니다.", Toast.LENGTH_SHORT).show();
                                listDataArrayList.add(userData);
                            }
                        } else if (listDataArrayList.size() == 0) {
                            //listDataArrayList의 size가 0이면 무조건 새로운값 저장
                            Toast.makeText(getApplicationContext(), "새로운 정보로 시작합니다.", Toast.LENGTH_SHORT).show();
                            listDataArrayList.add(userData);
                        }

                        //올바르게 값 저장후에 MainActivity.class으로 intent이동
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        //형식이 올바르지 않을때
                        Toast.makeText(getApplicationContext(), "올바른 형식이 아닙니다.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    //입력 데이터중에 빈값이 있을때
                    Toast.makeText(getApplicationContext(), "전부 입력해 주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });*/












    }
}
