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

public class pri extends AppCompatActivity {

    ImageView img;

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pri);

        btn1=findViewById(R.id.delete_account_button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(pri.this, introActivity.class);
                startActivity(intent1);

                Toast.makeText(pri.this, "Account Deleted Successfully!", Toast.LENGTH_LONG).show();

            }
        });

        btn2=findViewById(R.id.clear_data_button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(pri.this, pri.class);
                startActivity(intent1);

                Toast.makeText(pri.this, "Clear Data Successfully!", Toast.LENGTH_LONG).show();

            }
        });

        btn3=findViewById(R.id.save_button);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(pri.this, pro.class);
                startActivity(intent1);

                Toast.makeText(pri.this, "Changes Applied!", Toast.LENGTH_LONG).show();

            }
        });

        img=findViewById(R.id.imageView10);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(pri.this, pro.class);
                startActivity(intent1);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}