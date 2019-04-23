package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    EditText et_add;
    Button btn_add;
    Button btn_del;
    ListView lv;

    List<String> list;
    ArrayAdapter adapter;

    View.OnClickListener v = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_add :
                    list.add(et_add.getText().toString());
                    adapter.notifyDataSetChanged();
                    break;
                case R.id.btn_del :
                    list.remove(0);
                    adapter.notifyDataSetChanged();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv = (ListView)findViewById(R.id.lv);

        list = new ArrayList<>();
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

        et_add = (EditText)findViewById(R.id.et_add);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_del = (Button)findViewById(R.id.btn_del);

        btn_add.setOnClickListener(v);
        btn_del.setOnClickListener(v);

    }
}
