package com.example.cogabut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login1,daftar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login1 = findViewById(R.id.login1);
        Button daftar1 =  findViewById(R.id.daftar1);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tampilkanHome = new Intent(MainActivity.this,homeActivity.class);
                startActivities(tampilkanHome);
            }
        });


        daftar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftar1();
            }
        });

    }

    private void daftar1() {
    }

    public void tampilkanDaftar(){
        Intent tampilkanRegister = new Intent(MainActivity.this,registerActivity.class);
        startActivities(tampilkanRegister);
    }

    private void startActivities(Intent tampilkanHome) {
    }


}