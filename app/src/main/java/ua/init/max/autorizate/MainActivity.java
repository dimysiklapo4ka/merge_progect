package ua.init.max.autorizate;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ua.init.max.autorizate.helper.Check;
import ua.init.max.autorizate.map.MapsActivity;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private Check check = new Check();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmailEditText = (EditText) findViewById(R.id.et_email);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);
    }

    protected void showInputDialog(View view) {

        // get prompts.xml view
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setView(promptView);

        final EditText editText = (EditText) promptView.findViewById(R.id.edit_text);
        // setup a dialog window
        alertDialogBuilder.setCancelable(false)
                .setTitle("forgot password")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                })
                .setNegativeButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create an alert dialog
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }

    public void newScreen(View v) {
        Intent intObj = new Intent(this, RegistrationActivity.class);
        startActivity(intObj);
    }

    public void logIn(View view){

        switch (view.getId()){
            case R.id.imageButton3:
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                break;
        }
//        if(!check.checkEmail(mEmailEditText.getText().toString()) ||
//                !check.checkPasword(mPasswordEditText.getText().toString())){
//            dialogInvalidData().show();
//        } else {
//            Toast.makeText(this, "It is OK.", Toast.LENGTH_SHORT).show();
//        }
    }

    private AlertDialog dialogInvalidData(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setTitle("Atomization")
                .setMessage(R.string.invalid_data_message)
                .setCancelable(false)
                .setNegativeButton(R.string.invalid_data_button,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        return builder.create();
    }
}
