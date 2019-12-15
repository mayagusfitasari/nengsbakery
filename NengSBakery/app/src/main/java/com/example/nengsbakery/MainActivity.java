package com.example.nengsbakery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btntentang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btntentang = (Button) findViewById(R.id.btn_tentang);
        btntentang.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_tentang:
                startActivity(new Intent(this, SecondActivity.class));
                break;



        }
    }
}