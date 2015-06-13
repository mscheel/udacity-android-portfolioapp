package com.example.udacity.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButtonSpotify;
    Button mButtonScores;
    Button mButtonLibrary;
    Button mButtonBigger;
    Button mButtonXyz;
    Button mButtonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonSpotify = (Button) findViewById(R.id.button_spotify);
        mButtonScores = (Button) findViewById(R.id.button_scores);
        mButtonLibrary = (Button) findViewById(R.id.button_library);
        mButtonBigger = (Button) findViewById(R.id.button_bigger);
        mButtonXyz = (Button) findViewById(R.id.button_xyz);
        mButtonCapstone = (Button) findViewById(R.id.button_capstone);

    }

    public void buttonClick(View v) {
        Toast.makeText(this, ((Button) v).getText(), Toast.LENGTH_SHORT).show();
    }

}
