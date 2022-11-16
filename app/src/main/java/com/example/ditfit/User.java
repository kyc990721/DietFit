package com.example.ditfit;

public class User {
    String name; //유저 이름
    String email; //유저 이메일
    String exercise; //운동 이름

    public User() {
    } // 생성자 메서드


    //getter, setter 설정
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }


    //값을 추가할때 쓰는 함수
    public User(String name,String email) {
        this.name = name;
        this.email = email;
    }
}
