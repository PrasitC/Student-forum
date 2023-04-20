package com.example.bw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
     String notes[]={"notice1","notice2","notice3","notice4","notice5","notice6","notice7","notice8","notice9","notice10","notice11","notice12"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();
        String name= intent.getStringExtra(MainActivity.EXTRA_NAME);
        listView=findViewById(R.id.listView);
        ArrayAdapter ad= new ArrayAdapter( this, android.R.layout.simple_list_item_1, notes);
        listView.setAdapter(ad);

    }
}