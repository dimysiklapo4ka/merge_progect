package ua.init.max.autorizate.rolesRoma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ua.init.max.autorizate.R;

public class VisaD05Activity extends AppCompatActivity implements View.OnClickListener {

    Button mBtListOfDocuments;
    Button mBtNearestAgents;
    Button mBtAppointAdmissionDate;
    Button mBtFindAJobWithAFreeInvitation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_d05);

        mBtListOfDocuments = (Button) findViewById(R.id.bt_list_of_documents);
        mBtListOfDocuments.setOnClickListener(this);
        mBtNearestAgents = (Button) findViewById(R.id.bt_nearest_agents);
        mBtNearestAgents.setOnClickListener(this);
        mBtAppointAdmissionDate = (Button) findViewById(R.id.bt_appoint_admission_date);
        mBtAppointAdmissionDate.setOnClickListener(this);
        mBtFindAJobWithAFreeInvitation = (Button) findViewById(R.id.bt_find_a_job_with_a_free_invitation);
        mBtFindAJobWithAFreeInvitation.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        Intent intent;
        switch (v.getId()) {
            case R.id.bt_list_of_documents:
                Toast.makeText(this, "ListOfDocumentsForD05Activity will be implemented in the future", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.bt_nearest_agents:
                Toast.makeText(this, "NearestAgentsActivity will be implemented in the future", Toast.LENGTH_SHORT).show();;
                break;
            case R.id.bt_appoint_admission_date:
                Toast.makeText(this, "AppointAdmissionDateActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_find_a_job_with_a_free_invitation:
                Toast.makeText(this, "FindAJobWithAFreeInvitationActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
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
//public class VisaD05Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_visa_d05);
//    }
//}
