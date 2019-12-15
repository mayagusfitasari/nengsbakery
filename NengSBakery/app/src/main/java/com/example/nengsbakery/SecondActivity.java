package com.example.nengsbakery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btntentang;
    private ImageButton btnroti;
    private ImageButton btnroti2;
    private ImageButton btnroti3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton btntentang =(ImageButton) findViewById(R.id.button_tentang);
        btntentang.setOnClickListener(this);

        ImageButton btnroti =(ImageButton) findViewById(R.id.button_roti);
        btnroti.setOnClickListener(this);

        ImageButton btnroti2 =(ImageButton) findViewById(R.id.button_roti2);
        btnroti2.setOnClickListener(this);

        ImageButton btnroti3 =(ImageButton) findViewById(R.id.button_roti3);
        btnroti3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_tentang:
                startActivity(new Intent(this, OrderActivity.class));
                break;
        }
        switch (view.getId()) {
            case R.id.button_roti:
                startActivity(new Intent(this, OrderActivity1.class));
                break;
        }
        switch (view.getId()) {
            case R.id.button_roti2:
                startActivity(new Intent(this, OrderActivity2.class));
                break;
        }
        switch (view.getId()) {
            case R.id.button_roti3:
                startActivity(new Intent(this, second3.class));
                break;
        }
    }
}
