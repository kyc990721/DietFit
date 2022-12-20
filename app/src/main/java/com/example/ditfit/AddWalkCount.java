package com.example.ditfit;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ditfit.ui.home.HomeFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AddWalkCount extends BroadcastReceiver {
    private FirebaseAuth mAuth;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = database.getReference();

    @Override
    public void onReceive(Context context, Intent intent) {

        Date currentTime = Calendar.getInstance().getTime();
        int zerowalk = WalkCount.currentSteps;
        SimpleDateFormat formatY = new SimpleDateFormat("yyyy", Locale.getDefault());
        SimpleDateFormat formatM = new SimpleDateFormat("MM", Locale.getDefault());
        SimpleDateFormat formatD = new SimpleDateFormat("dd", Locale.getDefault());
        String year = formatY.format(currentTime);
        String month = formatM.format(currentTime);
        String day = formatD.format(currentTime);
        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = mAuth.getCurrentUser(); //현재 로그인한 사용자 가져오기
        databaseReference.child("Users").child(user.getUid().toString()).child("Exercise")
                .child(year).child(month).child(day).child("Walkcount").setValue(String.valueOf(zerowalk));
        WalkCount.currentSteps = 0;
        WalkCount.mCounterSteps = 0;
    }
}
