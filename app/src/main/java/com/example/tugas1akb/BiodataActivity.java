package com.example.tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
    NIM                 : 10118705
    Nama                : Dirza Aulia
    Kelas               : IF-6K
    Tanggal Pengerjaan  : 2 April 2020
    Deskripsi Pekerjaan : Membuat halaman ketiga aplikasi yaitu halaman Biodata secara desain dan pemrogramannya.
 */

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        Button button = findViewById(R.id.buttonBiodata);
        final EditText editTextNama = findViewById(R.id.editTextNama);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeActivity.class);
                intent.putExtra("nama", editTextNama.getText().toString());
                finish();
                startActivity(intent);
            }
        });
    }
}
