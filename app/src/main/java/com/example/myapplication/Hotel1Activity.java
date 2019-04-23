package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hotel1Activity extends AppCompatActivity {


    Button hotel11;
    Button back1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1);



        hotel11 =  findViewById(R.id.hotel11);

        hotel11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel1Activity.this,ListActivity.class);
                startActivity(intent);


            }
        });

        back1 = findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel1Activity.this,MainActivity.class);
                startActivity(intent);


            }
        });


    }
}
