package com.example.a10119275dafanafikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
/** Nama : Dafana Fikri */

/** NIM : 10119275 */

/** Kelas : IF-7 */

/** Tanggal pengerjaan : 23-04-2022 */

public class Register10119275 extends AppCompatActivity {
    private Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register10119275);
        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(v -> {
            Intent intent = new Intent(Register10119275.this, Login10119275.class);
            startActivity(intent);
        });
    }
}