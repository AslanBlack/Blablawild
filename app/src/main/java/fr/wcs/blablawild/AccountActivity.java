package fr.wcs.blablawild;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountActivity extends AppCompatActivity {

    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // User is signed in
                    Intent changeToAccount = new Intent(AccountActivity.this, SignupActivity.class);

                    startActivity(changeToAccount);

                } else {
                    // User is signed out
                    //Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };


    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();

        Intent logout = new Intent(AccountActivity.this, MainActivity.class);

        startActivity(logout);

    }

}
