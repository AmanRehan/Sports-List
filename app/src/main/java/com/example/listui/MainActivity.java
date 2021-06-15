package com.example.listui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String text_list[] = {"Basketball","football","Bowling","Cycling","Diving","Golf","Gymnastics","Handball","Tennis","Volleyball","Weight Lifting"};
    int img_list[]  = {R.drawable.basketball,R.drawable.football1,R.drawable.bowling,R.drawable.cycling,R.drawable.diving,
            R.drawable.golf,R.drawable.gymnastics,R.drawable.handball,R.drawable.tennis,R.drawable.volleyball,R.drawable.weight};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview1);
        customAdopter obj = new customAdopter(getApplicationContext(),text_list,img_list);
        listView.setAdapter(obj);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,"You have selected : "+ listView.getItemAtPosition(i),Toast.LENGTH_LONG).show();
            }
        });


    }
}