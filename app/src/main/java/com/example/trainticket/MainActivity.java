package com.example.trainticket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newTicket = (Button) findViewById(R.id.newTicket);
        Button showTime = (Button) findViewById(R.id.showTime);
        Button editOrDelete = (Button) findViewById(R.id.editOrDelete);

        newTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticketIntent = new Intent(getApplicationContext(), com.example.trainticket.newTicket.class);
                startActivity(ticketIntent);

            }

        });

        showTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timeIntent = new Intent(getApplicationContext(), com.example.trainticket.showTime.class);
                startActivity(timeIntent);
            }
        });

        editOrDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(getApplicationContext(), com.example.trainticket.editOrDelete.class);
                startActivity(editIntent);
            }
        });


    }
}
