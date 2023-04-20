package com.example.bw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    public  static  final String EXTRA_NAME="com.example.bw.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    
    public void openActivity(View v){
        Toast.makeText(this, "welcomes you in the family", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,MainActivity2.class);
        editText=findViewById(R.id.edittext);
        String nameText= editText.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);
        startActivity(intent);

    }
}