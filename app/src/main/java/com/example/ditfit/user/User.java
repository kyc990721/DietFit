package com.example.ditfit.user;

import android.os.Bundle;

import androidx.annotation.NonNull;

public class User {
    String name; //유저 이름
    String email; //유저 이메일
    String exercise; //운동 이름
    String uid; //현재 사용자(로그인한)
    String year;
    String month;
    String day;
    String set;
    String number;
    String kg;
    String walk;

    public User() {
    } // 생성자 메서드


    //getter, setter 설정
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }



    //값을 추가할때 쓰는 함수
    public User(String name,String email,String uid,String exercise) {
        this.name = name;
        this.email = email;
        this.uid = uid;
        this.exercise = exercise;
    }


}
