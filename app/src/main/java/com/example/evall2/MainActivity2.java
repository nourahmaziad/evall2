package com.example.evall2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView recive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recive=findViewById(R.id.reciveM);
        Intent intent = getIntent();
        String m = intent.getStringExtra("send_text_id");
        recive.setText("hello "+m+" !");

    }
}