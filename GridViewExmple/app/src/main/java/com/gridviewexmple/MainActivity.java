package com.gridviewexmple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    adpterexample adpter;
    int[] images = {
            R.drawable.gingerdroid,
            R.drawable.honeycomb,
            R.drawable.icecreamsandwitch,
            R.drawable.jellybean,
            R.drawable.kitkat,
            R.drawable.lolipop


    };

    String[] name = {
"Ginger Bread ",
            "Honey Comb"
,
            "Ice Cream Sandwitch"
            ,
            "Jelly Bean",
            "Kitkat"
            ,
            "Lolipop"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = (GridView) findViewById(R.id.gd);
        adpter=new adpterexample(this,images,name);
        grid.setAdapter(adpter);

    }
}