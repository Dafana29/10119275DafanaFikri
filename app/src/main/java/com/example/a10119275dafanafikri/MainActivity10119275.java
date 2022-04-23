package com.example.a10119275dafanafikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity10119275 extends AppCompatActivity {
    private Button btn_profile,btn_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10119275);
        btn_profile = findViewById(R.id.btn_profile);
        btn_logout = findViewById(R.id.btn_logout);
        btn_profile.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity10119275.this, Profile10119275.class);
            startActivity(intent);
        });
        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity10119275.this, Login10119275.class);
            startActivity(intent);
        });
    }
}