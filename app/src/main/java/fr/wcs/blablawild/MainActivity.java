package fr.wcs.blablawild;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void goToSearch(View view){

        Intent changeToSearch = new Intent(MainActivity.this, SearchItinaryActivity.class);

        startActivity(changeToSearch);

    }

    public void goTocreateTrip (View view){

        Intent changeToCreateTrip = new Intent(MainActivity.this, SubmitItineraryActivity.class);

        startActivity(changeToCreateTrip);

    }

    public void goToSignup (View view){

        Intent changeToSignup = new Intent(MainActivity.this, SignupActivity.class);

        startActivity(changeToSignup);

    }

    public void goToSignin(View view){

        Intent changeToSignin = new Intent(MainActivity.this, SigninActivity.class);

        startActivity(changeToSignin);

    }

    public void openAccount(View view){
        Intent account = new Intent(MainActivity.this, AccountActivity.class);

        startActivity(account);
    }



}


