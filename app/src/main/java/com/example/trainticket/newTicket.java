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
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class newTicket extends AppCompatActivity {

//    Button btn_date = (Button) findViewById(R.id.btn_date);
//    Button btn_time = (Button) findViewById(R.id.btn_time);
//    TextView in_date = (TextView) findViewById(R.id.in_date);
//    EditText in_time = (EditText) findViewById(R.id.in_time);

    EditText tv,tv1;
    int day,month,year;

    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_ticket);

        tv = (EditText) findViewById(R.id.editText3);
        tv1 = (EditText) findViewById(R.id.editText4);

        Calendar mCurrentDate;


        mCurrentDate = Calendar.getInstance();

        day = mCurrentDate.get(Calendar.DAY_OF_MONTH);
        month = mCurrentDate.get(Calendar.MONTH)+1;
        year = mCurrentDate.get(Calendar.YEAR);

        tv.setText(day+"/"+month+"/"+year);
        tv1.setText(day+"/"+month+"/"+year);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog1();
            }
        });

        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ticketIntent = new Intent(getApplicationContext(), com.example.trainticket.payment.class);
                startActivity(ticketIntent);
            }
        });
        }

    private void showDateDialog() {
        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tv.setText(dayOfMonth+"/"+month+"/"+year);

            }
        };

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,listener, year,month,day);

        datePickerDialog.show();
    }

    private void showDateDialog1() {
        DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tv1.setText(dayOfMonth+"/"+month+"/"+year);

            }
        };

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,listener, year,month,day);

        datePickerDialog.show();
    }

}
