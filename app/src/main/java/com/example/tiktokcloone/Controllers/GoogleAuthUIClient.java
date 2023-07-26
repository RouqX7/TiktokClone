package com.example.tiktokcloone.Controllers;

import android.app.Activity;
import android.content.Intent;

import com.example.tiktokcloone.Constants;
import com.example.tiktokcloone.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
public class GoogleAuthUIClient {
    private static final int RC_SIGN_IN = 9001;
    private final Activity mActivity;
    private final GoogleSignInClient mGoogleSignInClient;
    private final FirebaseAuth mAuth;

    public GoogleAuthUIClient(Activity activity) {
        mActivity = activity;
        mAuth = FirebaseAuth.getInstance();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(activity.getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso);
    }
    public void signInWithGoogle() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        mActivity.startActivityForResult(signInIntent, Constants.RC_SIGN_IN);
    }

    public void handleSignInResult(Intent data) {
        GoogleSignInAccount account = GoogleSignIn.getSignedInAccountFromIntent(data).getResult();
        if (account != null) {
            firebaseAuthWithGoogle(account);
        } else {
            // Handle Google Sign-In failure here.
        }
    }
    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Firebase Sign-In was successful, update UI with the signed-in user's information.
                        FirebaseUser user = mAuth.getCurrentUser();
                        // You can access user information using: user.getDisplayName(), user.getEmail(), etc.
                    } else {
                        // Handle Firebase Sign-In failure here.
                    }
                });
    }

        public void signInWithActivity(Intent data) {
            handleSignInResult(data);
        }

    }

