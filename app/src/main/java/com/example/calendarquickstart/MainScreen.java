package com.example.calendarquickstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CalendarView;
import android.view.View;
import android.content.Intent;


public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void onClick(View view){
        Intent i = new Intent(this, setMeet.class);

        startActivity(i);
    }
}
