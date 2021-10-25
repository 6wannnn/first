package com.example.first.db;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class ReadAndWriteSnippets<mDatabase> {
    private DatabaseReference mDatabase;
    mDatabase= FirebaseDatabase.getInstance().getReference();

    public void writeNewUser(String userID, String nickname, String introduce, int reported_num){
        User user=new User(nickname,introduce,reported_num);
        mDatabase.child("users").child(userID).setValue(user);
        mDatabase.child("users").child(userID).child("nickname").setValue(nickname);
        mDatabase.child("users").child(userID).child("introduce").setValue(introduce)
    }
};



