package com.example.android.sunshine;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentMain.OnFragmentInteractionListener {

    //322966e17c118d91a63ac94df106d7bb
    //http://api.openweathermap.org/data/2.5/forecast/daily?q=London&mode=json&units=metric&cnt=7&appid=322966e17c118d91a63ac94df106d7bb

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new FragmentMain())
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
