package com.example.ditfit;

import static com.example.ditfit.user.SignUpActivity.userBoard;
import static com.example.ditfit.user.SignUpActivity.userClass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ditfit.user.User;
import com.google.android.gms.dynamic.SupportFragmentWrapper;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WriteActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    DatabaseReference mDatabase;

    String uid;

    Spinner spinner_write_type; // 분류
    EditText write_title, write_content; // 제목 , 내용
    Button button_board_register;

    ArrayList<String> writeKey = null;
    ArrayList<String> writeValue = null;

    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        final FirebaseUser user = mAuth.getCurrentUser();
        uid = user.getUid();

        final FirebaseUser CurrentUser = mAuth.getCurrentUser(); //현재 로그인한 사용자 가져오기


        spinner_write_type = (Spinner) findViewById(R.id.spinner_write_type);
        write_title = (EditText) findViewById(R.id.editText_write_title);
        write_content = (EditText) findViewById(R.id.editText_writeContent);
        button_board_register = (Button) findViewById(R.id.button_write_register);

        writeKey = new ArrayList<>();
        writeValue = new ArrayList<>();


        button_board_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (write_title.getText().toString().equals("")) {
                    Toast.makeText(WriteActivity.this, "제목을 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (write_content.getText().toString().equals("")) {
                    Toast.makeText(WriteActivity.this, "내용을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                int index = spinner_write_type.getSelectedItemPosition(); // spinner 에서 선택된 것을 index 로 저장을 함

//        MainPage mainPage = new MainPage();
                User Currentuser = userClass; // 전역으로 쓰는 user에 저장된 값을 불러옴

                //날짜 포맷
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
                SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

                Date time = new Date();

                String today = dateFormat.format(time);
                String order_today = dateFormat2.format(time);

                Board board = new Board("","","","","","","");
                board.setTitle(write_title.getText().toString());

                board.setContent(write_content.getText().toString());

//                board.setContentType(writeKey.get(index));
                board.setUid(uid);
                board.setName(Currentuser.getName());
                board.setDate(today);
                board.setOrder_date(order_today);


                mDatabase.child("Board").child(uid).push().setValue(board); //push 는 FireBase에서 제공하는 api 로 여러명이 동시에 클라이언트를 이용할때 어떤 값에 대해서 독립을 보장하는 프라이머리 key 입니다

            }
        });

        //getBoardType(); // 게시판 분류를 가지고 올것임
    }

//    public void getBoardType() {
//        mDatabase.child("boardType").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                Map<String, String> data = (HashMap) dataSnapshot.getValue();
//
//                writeKey.clear();
//                writeValue.clear();
//
//                for (Map.Entry<String, String> entry : data.entrySet()) { //key , value 를 구분하기 위해서 만든 분리기
//                    writeKey.add(entry.getKey()); // 그 각 값을 각각 분리해서 넣음
//                    writeValue.add(entry.getValue());
//                }
//
//                adapter = new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_item, writeValue);
//                adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line); // dropDown 스타일 설정
//
//                spinner_write_type.setAdapter(adapter);
//
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }
}