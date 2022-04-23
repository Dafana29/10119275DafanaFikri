package com.example.a10119275dafanafikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/** Nama : Dafana Fikri */

/** NIM : 10119275 */

/** Kelas : IF-7 */

/** Tanggal pengerjaan : 23-04-2022 */

public class Login10119275 extends AppCompatActivity {
    private Button btn_login,btn_registrasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login10119275);
        btn_login = findViewById(R.id.btn_login);
        btn_registrasi = findViewById(R.id.btn_registrasi);
        btn_login.setOnClickListener(v -> {
            Intent intent = new Intent(Login10119275.this, MainActivity10119275.class);
            startActivity(intent);
        });
        btn_registrasi.setOnClickListener(v -> {
            Intent intent1 = new Intent(Login10119275.this, Register10119275.class);
            startActivity(intent1);
        });
    }
}