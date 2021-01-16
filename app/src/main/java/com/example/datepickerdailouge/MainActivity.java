package com.example.datepickerdailouge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView showDateTextView;
    private Button buttonID;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDateTextView = (TextView) findViewById(R.id.showDateTextView);
        buttonID = (Button) findViewById(R.id.buttonID);
        buttonID.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.buttonID){

            DatePicker  datePicker= new DatePicker(MainActivity.this);
            int currentDayOfMonth = datePicker.getDayOfMonth();
            int currentMonthOfYear = datePicker.getMonth();
            int currentYear = datePicker.getYear();



            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int currentDayOfMonth, int currentMonthOfYear, int currentYear) {
                    showDateTextView.setText(currentYear+"/"+currentMonthOfYear+"/"+currentDayOfMonth);
                }
            },currentDayOfMonth,currentMonthOfYear,currentYear);
            datePickerDialog.show();



        }
    }
}