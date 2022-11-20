package com.example.ditfit.user;

public class User {
    String name; //유저 이름
    String email; //유저 이메일
    String exercise; //운동 이름
    String uid; //현재 사용자(로그인한)

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


    //값을 추가할때 쓰는 함수
    public User(String name,String email,String uid,String exercise) {
        this.name = name;
        this.email = email;
        this.uid = uid;
        this.exercise = exercise;
    }
}
