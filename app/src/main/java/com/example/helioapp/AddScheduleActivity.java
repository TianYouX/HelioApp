package com.example.helioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_schedule);

//        MainActivity a = new MainActivity();
//        a.nevigateBetweenPages();

        Button mBtnButton1;
        Button mBtnButton2;
        Button mBtnButton3;

        //jump to the Home page
        mBtnButton1 = (Button) findViewById(R.id.btn_Button1);
        mBtnButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AddScheduleActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //jump to the AddScheduleActivity page
        mBtnButton2 = (Button) findViewById(R.id.btn_Button2);
        mBtnButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AddScheduleActivity.this,AddScheduleActivity.class);
                startActivity(intent);
            }
        });

        //jump to the AddHub page
        mBtnButton3 = (Button) findViewById(R.id.btn_Button3);
        mBtnButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(AddScheduleActivity.this,AddHubActivity.class);
                startActivity(intent);
            }
        });

    }
}