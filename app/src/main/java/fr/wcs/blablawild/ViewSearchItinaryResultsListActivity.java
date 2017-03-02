package fr.wcs.blablawild;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

public class ViewSearchItinaryResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinary_results_list);

        Intent changeActivity = getIntent();
        String message = changeActivity.getStringExtra("osef");
        String message2 = changeActivity.getStringExtra("feso");
        String fleche = getString(R.string.fleche);
        this.setTitle(message + fleche + message2);





    }





}
