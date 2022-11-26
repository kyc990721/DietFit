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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class StaticsFragment extends Fragment {
    private FragmentStaticsBinding binding;

    FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    Button WriteButton;
    ListView mainListView;
    ListAdapter listAdapter = null;
    Callback callback;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStaticsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser();
        mainListView = binding.listMainListView;
        WriteButton = binding.writeButton;
        listAdapter = new ListAdapter(); // 객체 주입

        WriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),WriteActivity.class);
                startActivity(intent);
            }
        });

        getBoard();

        return root;
    }

    public void getBoard() { // 원래는 텍스트하고 포토 하고 구분을 할려고 했는데 일단 text만 따로 뽑기로 하겠습니다
//        Board board = userBoard;
        mDatabase.getReference().child("Board").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Map<String, String> map = (Map) dataSnapshot.getValue();
                mainListView.setAdapter(listAdapter);


                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Board board = snapshot.getValue(Board.class);
                    listAdapter.addItem(board.getTitle(), board.getDate(), board.getName());

                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });

    }
    public interface Callback{
        void success(String data);
        void fail(String errorMessage);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}