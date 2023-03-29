package com.example.evall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b =(Button) findViewById(R.id.send_button_id);//i can do cast if i have problem (button)
        e= (EditText) findViewById(R.id.send_text_id);
        b.setOnClickListener(view -> {
            String s =e.getText().toString();
            Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("send_text_id", s);
            startActivity(intent);

        });
    }
}