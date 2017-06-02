package ua.init.max.autorizate.rolesRoma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import ua.init.max.autorizate.R;

public class TypeOfVisaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton mBtForVisaD05;
    ImageButton mBtForVisaD07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_visa);

        mBtForVisaD05 = (ImageButton)findViewById(R.id.bt_for_visa_d_05);
        mBtForVisaD05.setOnClickListener(this);
        mBtForVisaD07 = (ImageButton)findViewById(R.id.bt_for_visa_d_07);
        mBtForVisaD07.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_for_visa_d_05:
                Intent intent = new Intent(this, VisaD05Activity.class);
                startActivity(intent);
                break;
            case R.id.bt_for_visa_d_07:
                Toast.makeText(this, "VisaD07Activity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}





//package com.example.roman.epic1;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class TypeOfVisaActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_type_of_visa);
//    }
//}
