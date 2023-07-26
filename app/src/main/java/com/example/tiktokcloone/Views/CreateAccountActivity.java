package com.example.tiktokcloone.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tiktokcloone.Controllers.GoogleAuthUIClient;
import com.example.tiktokcloone.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CreateAccountActivity extends AppCompatActivity {
    private GoogleAuthUIClient mGoogleAuthUIClient;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        mGoogleAuthUIClient = new GoogleAuthUIClient(this);

        Button btnGoogleSignUp = findViewById(R.id.btn_sign_up_with_google);
        btnGoogleSignUp.setOnClickListener(view -> mGoogleAuthUIClient.signInWithGoogle());
    }
    @Override
    public void onStart() {
        mGoogleAuthUIClient = new GoogleAuthUIClient(this);

        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);

    }

}