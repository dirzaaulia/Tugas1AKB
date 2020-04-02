package com.example.tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button = findViewById(R.id.buttonHome);
        TextView textView = findViewById(R.id.textViewHome);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");

        textView.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP " + nama + " tiap hari buat bantu " + nama + " ngatur waktu :)" );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
