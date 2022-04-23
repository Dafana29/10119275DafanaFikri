package com.example.a10119275dafanafikri;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
/** Nama : Dafana Fikri */

/** NIM : 10119275 */

/** Kelas : IF-7 */

/** Tanggal pengerjaan : 23-04-2022 */

public class SplashScreen10119275 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen10119275);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Login10119275.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}