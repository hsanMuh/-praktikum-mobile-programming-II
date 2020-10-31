package com.example.praktikum_mobile_programming_ii.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.praktikum_mobile_programming_ii.R;

public class ReciverActivity extends AppCompatActivity {
    String Message;
    TextView textviewWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        Intent intent = getIntent();
        textviewWelcome =findViewById(R.id.textviewWelcome);
        Message = intent.getStringExtra("welcome");
    }
    @Override
    protected void onResume() {
        super.onResume();

        textviewWelcome.setText(Message);
    }
}

