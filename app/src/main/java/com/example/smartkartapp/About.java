package com.example.smartkartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class About extends AppCompatActivity {
    Button tw,ld,gt,ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        gt=findViewById(R.id.gt);
        tw=findViewById(R.id.tw);
        ig=findViewById(R.id.ig);
        ld=findViewById(R.id.ld);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/rohittt.singh/"));
                startActivity(intent);
            }
        });



        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/rohitttsingh"));
                startActivity(intent);
            }
        });

        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/rohit-singh-1132531b5/"));
                startActivity(intent);
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/rohitttsingh07"));
                startActivity(intent);
            }
        });


    }
}
