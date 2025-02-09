package com.example.sea;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sub extends AppCompatActivity {

    ImageView img;
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        img=findViewById(R.id.back_button);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub.this, pro.class);
                startActivity(intent1);
            }
        });

        btn1=findViewById(R.id.subscribe_basic);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub.this, pro.class);
                startActivity(intent1);

                Toast.makeText(Sub.this, "Successfully Activate Basic Subscription Plan!", Toast.LENGTH_LONG).show();

            }
        });

        btn2=findViewById(R.id.subscribe_premium);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub.this, pro.class);
                startActivity(intent1);

                Toast.makeText(Sub.this, "Successfully Activate Premiun Plan!", Toast.LENGTH_LONG).show();

            }
        });

        btn3=findViewById(R.id.subscribe_lifetime);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Sub.this, pro.class);
                startActivity(intent1);

                Toast.makeText(Sub.this, "Successfully Activate Lifetime Plan", Toast.LENGTH_LONG).show();

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}