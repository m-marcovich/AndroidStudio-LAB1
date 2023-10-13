package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.textView);

        Button cButton = findViewById(R.id.cButton);
        cButton.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
    }

    public void ChangeTexT(View view) {
        this.tvMain.setText("Change Text");
    }
}