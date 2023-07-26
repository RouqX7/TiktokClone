package com.example.tiktokcloone.Views;

import static com.example.tiktokcloone.Constants.RC_SIGN_IN;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;

import com.example.tiktokcloone.Controllers.GoogleAuthUIClient;
import com.example.tiktokcloone.R;
import com.facebook.CallbackManager;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private GoogleAuthUIClient mGoogleAuthUIClient;
    private FacebookAuthUIClient mFacebookAuthUIClient;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mGoogleAuthUIClient = new GoogleAuthUIClient(this);
        mAuth = FirebaseAuth.getInstance();
        mFacebookAuthUIClient = new FacebookAuthUIClient(this,mAuth, CallbackManager.Factory.create());


        SignInButton btnGoogleSignIn = findViewById(R.id.btn_google_sign_in);
        btnGoogleSignIn.setOnClickListener(view -> mGoogleAuthUIClient.signInWithGoogle());

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            mGoogleAuthUIClient.handleSignInResult(data);
        }
    }



    }




