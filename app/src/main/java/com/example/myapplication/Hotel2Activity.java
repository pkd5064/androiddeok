package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hotel2Activity extends AppCompatActivity {

    Button hotel22;
    Button back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);

        hotel22 =  findViewById(R.id.hotel22);

        hotel22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel2Activity.this,ListActivity.class);
                startActivity(intent);


            }
        });
        back2 = findViewById(R.id.back2);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hotel2Activity.this,MainActivity.class);
                startActivity(intent);



            }
        });



    }
}
