package ua.init.max.autorizate.rolesRoma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import ua.init.max.autorizate.R;

public class RolesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton mBtForWorker;
    ImageButton mBtForEmployer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);

        mBtForWorker = (ImageButton)findViewById(R.id.bt_for_worker);
        mBtForWorker.setOnClickListener(this);
        mBtForEmployer = (ImageButton)findViewById(R.id.bt_for_employer);
        mBtForEmployer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_for_worker:
                Intent intent = new Intent(this, CurrentStatusActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_for_employer:
                Toast.makeText(this, "EmployerActivity will be implemented in the future", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
