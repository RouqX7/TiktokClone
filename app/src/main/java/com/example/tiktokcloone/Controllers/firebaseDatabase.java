package com.example.tiktokcloone.Controllers;

import static android.content.ContentValues.TAG;

import android.util.Log;

import com.example.tiktokcloone.Models.User;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class firebaseDatabase {
    private FirebaseFirestore db;

    public  firebaseDatabase(){
        db = FirebaseFirestore.getInstance();

    }
    CollectionReference userRef = db.collection("User");

    public void createUser(User user){
        db.collection("user")
                .add(user)
                .addOnSuccessListener(documentReference -> {
                    String userId = documentReference.getId();
                    Log.d(TAG,"User added with ID: " + userId);
                })
                .addOnFailureListener(e -> {
                    Log.e(TAG,"Error adding customer");
                });
    }
}
