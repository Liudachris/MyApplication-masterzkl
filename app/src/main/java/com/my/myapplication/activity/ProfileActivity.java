package com.my.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.my.myapplication.R;

public class ProfileActivity extends AppCompatActivity {
    //Declare variables
    private EditText etName;
    private EditText etEmail;
    private TextView tvName;
    private TextView tvEmail;
    private Button btUpdate;
    private String str_name, str_email;
    private Button btProfileHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //Find EditView
        etName =findViewById(R.id.etName);
        etEmail =findViewById(R.id.etEmail);
        //Find TextView
        tvName  =findViewById(R.id.tvName);
        tvEmail =findViewById(R.id.tvEmail);
        btUpdate = findViewById(R.id.btUpdate);
        btProfileHome = findViewById(R.id.btProfileHome);

        //Assign Button to go back to Home Page
        btProfileHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //Assign Update Button to delivery Name and Email to TextView
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId = v.getId();
                if(viewId == R.id.btUpdate){
                    str_name = etName.getText().toString().trim();
                    str_email = etEmail.getText().toString().trim();
                    tvName.setText(str_name);
                    tvEmail.setText(str_email);
                }
            }
        });

    }

}
