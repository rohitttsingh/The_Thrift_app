package com.example.smartkartapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RegLogChoice extends AppCompatActivity {
    Button reg,log;
    TextView admlog,stflog,about;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_log_choice);
        reg=(Button)findViewById(R.id.btnreg);
        log=(Button)findViewById(R.id.btnlog);
        admlog=(TextView)findViewById(R.id.admlog);
        stflog=(TextView)findViewById(R.id.stflog);
        about=(TextView)findViewById(R.id.tvAbout);
        logo= findViewById(R.id.logo);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegLogChoice.this,LoginPage.class);
                ActivityOptionsCompat optionsCompat =  ActivityOptionsCompat.makeSceneTransitionAnimation(RegLogChoice.this
                        ,logo, ViewCompat.getTransitionName(logo));

                startActivity(intent,optionsCompat.toBundle());
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegLogChoice.this,RegisterPage.class);
                ActivityOptionsCompat optionsCompat =  ActivityOptionsCompat.makeSceneTransitionAnimation(RegLogChoice.this
                        ,logo, ViewCompat.getTransitionName(logo));
                startActivity(intent,optionsCompat.toBundle());
            }
        });
        admlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegLogChoice.this,AdminLogin.class));
            }
        });
        stflog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegLogChoice.this,StaffLogin.class));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegLogChoice.this,About.class));
            }
        });
    }
    public void onBackPressed(){
     moveTaskToBack(true);
     android.os.Process.killProcess(android.os.Process.myPid());
     System.exit(1);
    }
}
