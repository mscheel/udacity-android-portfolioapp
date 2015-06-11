package com.example.udacity.appportfolio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by A596969 on 6/9/15.
 */
public class ToasterButton extends Button implements View.OnClickListener {

    Context mContext;
    ArrayList<Integer> mColors;

    public ToasterButton (Context context, AttributeSet attrs) {
        super(context, attrs);

        mColors = new ArrayList<Integer>();
        mColors.add(getResources().getColor(R.color.md_amber_500));
        mColors.add(getResources().getColor(R.color.md_pink_500));
        mColors.add(getResources().getColor(R.color.md_green_500));
        mColors.add(getResources().getColor(R.color.md_blue_500));
        mColors.add(getResources().getColor(R.color.md_brown_500));

        mContext = context;
        setOnClickListener(this);
        Random r = new Random();
        int index = r.nextInt(5);
        this.setBackgroundColor(mColors.get(index));
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(mContext, this.getText(), Toast.LENGTH_SHORT).show();
        Random r = new Random();
        int index = r.nextInt(5);
        this.setBackgroundColor(mColors.get(index));
    }

}
