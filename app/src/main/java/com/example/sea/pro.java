package com.example.sea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class pro extends AppCompatActivity {

    private Button logout;
    private Button feedback;
    private Button sucb;

    private Button edit;
    private Button notification;
    private Button privacy;
    private Button social;
    private Button support;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pro);

        support=findViewById(R.id.help_support_button);
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,help.class);
                startActivity(intent);
            }
        });

        social=findViewById(R.id.connect_social_button);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,media.class);
                startActivity(intent);
            }
        });

        privacy=findViewById(R.id.privacy_settings_button);
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,pri.class);
                startActivity(intent);
            }
        });

        notification=findViewById(R.id.notification_settings_button);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,noti.class);
                startActivity(intent);
            }
        });

        sucb=findViewById(R.id.view_subscription_button);
        sucb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,Sub.class);
                startActivity(intent);
            }
        });

        edit=findViewById(R.id.edit_profile_button);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,editacc.class);
                startActivity(intent);
            }
        });

        logout=findViewById(R.id.logout_button);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,introActivity.class);
                startActivity(intent);
            }
        });

        feedback=findViewById(R.id.feedback_button);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pro.this,Feedback.class);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Type), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}