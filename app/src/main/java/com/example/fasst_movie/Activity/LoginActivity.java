package com.example.fasst_movie.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fasst_movie.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdit, passEdit;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

    }

    private void initView() {
        userEdit = findViewById(R.id.UserPerson);
        passEdit = findViewById(R.id.UserPassword);
        loginButton = findViewById(R.id.LoginBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userEdit.getText().toString().isEmpty() || passEdit.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please fill your User and Password", Toast.LENGTH_SHORT).show();
                }else if(userEdit.getText().toString().equals("netflix") && passEdit.getText().toString().equals("netflix")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this,"Your User and Password is not correct",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}


















