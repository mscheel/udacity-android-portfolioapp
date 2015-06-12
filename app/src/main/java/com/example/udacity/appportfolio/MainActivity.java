package com.example.udacity.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

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
}
