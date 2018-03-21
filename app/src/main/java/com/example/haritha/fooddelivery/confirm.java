package com.example.haritha.fooddelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class confirm extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        button = (Button) findViewById(R.id.userlogin1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });


        Intent intent4 = getIntent();
        String message = intent4.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.string_from_signin);
        textView.setText(message);

    }
    public void login() {
        Intent intent3 = new Intent(this, login.class);
        startActivity(intent3);
    }

}
