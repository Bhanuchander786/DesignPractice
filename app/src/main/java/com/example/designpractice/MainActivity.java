package com.example.designpractice;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout drawerlay;
    //RelativeLayout relativeLayout1;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerlay = findViewById(R.id.drawable);
        findViewById(R.id.lay1).setOnClickListener(this);
        findViewById(R.id.lay2).setOnClickListener(this);
        findViewById(R.id.relone).setOnClickListener(this);
        findViewById(R.id.reltwo).setOnClickListener(this);
        findViewById(R.id.relthree).setOnClickListener(this);
        findViewById(R.id.relfour).setOnClickListener(this);
        layout = findViewById(R.id.linearone);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.lay1) {
            findViewById(R.id.view1).setVisibility(View.VISIBLE);
            findViewById(R.id.view2).setVisibility(View.INVISIBLE);
        } else if (v.getId() == R.id.lay2) {
            findViewById(R.id.view2).setVisibility(View.VISIBLE);
            findViewById(R.id.view1).setVisibility(View.INVISIBLE);
        } else if (v.getId() == R.id.relone)
        {
            v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            //((TextView) findViewById(R.id.dashtxt1)).setTextColor(getResources().getColor(R.color.White));
            ((ImageView) findViewById(R.id.imageone)).setColorFilter(getResources().getColor(R.color.White));
            loop(v);
        }
        else if (v.getId() == R.id.reltwo)
        {
            v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            //((TextView) findViewById(R.id.dashtxt2)).setTextColor(getResources().getColor(R.color.White));
            ((ImageView) findViewById(R.id.imagetwo)).setColorFilter(getResources().getColor(R.color.White));
            loop(v);
        }
        else if (v.getId() == R.id.relthree)
        {
            v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            //((TextView) findViewById(R.id.dashtxt3)).setTextColor(getResources().getColor(R.color.White));
            ((ImageView) findViewById(R.id.imagethree)).setColorFilter(getResources().getColor(R.color.White));
            loop(v);
        }
        else if (v.getId() == R.id.relfour)
        {
            v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            //((TextView) findViewById(R.id.dashtxt4)).setTextColor(getResources().getColor(R.color.White));
            ((ImageView) findViewById(R.id.imagefour)).setColorFilter(getResources().getColor(R.color.White));
            loop(v);
        }


    }

    private void loop(View v)
    {
        RelativeLayout relativeLayout;
        for (int i = 0; i < layout.getChildCount(); i++)
        {
        relativeLayout=(RelativeLayout)layout.getChildAt(i);
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.White));
        }
        v.setBackgroundColor(getResources().getColor(R.color.colorAccent));

    }
}
