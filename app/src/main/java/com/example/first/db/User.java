package com.example.first.db;

import java.util.UUID;

public class User {

    public String nickname;
    public String introduce;
    public int reported_num;

    public User(){

    }
    public User(String nickname, String introduce, int reported_num){
        this.nickname=nickname;
        this.introduce=introduce;
        this.reported_num=reported_num;
    }
}
