package com.example.haritha.fooddelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button) findViewById(R.id.usersignup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin();
            }
        });

        button1 = (Button) findViewById(R.id.userlogin);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meal1();
            }
        });

    }

    public void signin() {
        Intent intent = new Intent(this, signin.class);
        startActivity(intent);
    }

    public void meal1() {
        Intent intent = new Intent(this, meal1.class);
        startActivity(intent);
    }
}
