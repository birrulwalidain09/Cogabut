package com.example.cogabut;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class registerActivity extends AppCompatActivity {

    Button daftar2;
    ImageView back;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        daftar2 = (Button) findViewById(R.id.daftar2);
        back = (ImageView) findViewById((R.id.back));

        daftar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tampilkanMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivities(tampilkanMain);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });



    }

    private void back() {
        Intent tampilkanMain = new Intent(getApplicationContext(),MainActivity.class);
        startActivities(tampilkanMain);
    }

    private void startActivities(Intent tampilkanHome) {
    }

}