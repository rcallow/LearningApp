package com.example.learningapp.ui;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.learningapp.R;

//import com.example.kidcube.R;
//import com.example.kidcube.ui.login.LoginViewModel;
//import com.example.kidcube.ui.login.LoginViewModelFactory;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton studentLoginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        studentLoginButton = (ImageButton)findViewById(R.id.student_button);
        studentLoginButton.setOnClickListener(LoginActivity.this);

        //final EditText usernameEditText = findViewById(R.id.username);
        //        final EditText passwordEditText = findViewById(R.id.password);
        //        final Button loginButton = findViewById(R.id.login);
        //        final ProgressBar loadingProgressBar = findViewById(R.id.loading);

    }



    @Override
    public void onClick(View view){
        if(view == studentLoginButton){
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
    }


}
