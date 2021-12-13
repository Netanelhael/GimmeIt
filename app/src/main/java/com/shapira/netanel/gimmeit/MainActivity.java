package com.shapira.netanel.gimmeit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView ivPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivPic = findViewById(R.id.ivPic);
        ivPic.setImageResource(R.drawable.pil);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                Toast.makeText(getApplicationContext(),"gfgfgf"+l/1000,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                Intent go = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(go);
            }
        }.start();
    }
}