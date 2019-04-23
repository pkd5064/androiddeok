package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hotel3Activity extends AppCompatActivity {

    Button hotel33;
    Button back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel3);

        hotel33 =  findViewById(R.id.hotel33);

        hotel33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel3Activity.this,ListActivity.class);
                startActivity(intent);


            }
        });

        back3 = findViewById(R.id.back3);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel3Activity.this,MainActivity.class);
                startActivity(intent);


            }
        });


    }
}
