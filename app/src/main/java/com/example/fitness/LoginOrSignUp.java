package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fitness.databinding.ActivityLoginOrSignUpBinding;

public class LoginOrSignUp extends AppCompatActivity {
    ActivityLoginOrSignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityLoginOrSignUpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrSignUp.this, Log_In_Page.class);
                startActivity(intent);
            }
        });

    }
}