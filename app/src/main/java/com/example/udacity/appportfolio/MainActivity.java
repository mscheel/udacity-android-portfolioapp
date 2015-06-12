package com.example.udacity.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ToasterButton mButton1;
    ToasterButton mButton2;
    ToasterButton mButton3;
    ToasterButton mButton4;
    ToasterButton mButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (ToasterButton) findViewById(R.id.button1);
        mButton2 = (ToasterButton) findViewById(R.id.button2);
        mButton3 = (ToasterButton) findViewById(R.id.button3);
        mButton4 = (ToasterButton) findViewById(R.id.button4);
        mButton5 = (ToasterButton) findViewById(R.id.button5);

    }
}
