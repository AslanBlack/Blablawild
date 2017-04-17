package fr.wcs.blablawild;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountActivity extends AppCompatActivity {

    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseAuth mAuth;
    private TextView mTextViewName;
    private TextView mTextViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        mAuth = FirebaseAuth.getInstance();
        mTextViewEmail = (TextView) findViewById(R.id.textViewEmail);
        mTextViewName = (TextView) findViewById(R.id.textViewName);
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
                    mTextViewEmail.setText(user.getEmail());
                    mTextViewName.setText(user.getDisplayName());
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

    public void onStart(){
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);

    }

}
