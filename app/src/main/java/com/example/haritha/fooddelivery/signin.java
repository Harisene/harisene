package com.example.haritha.fooddelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signin extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        button = (Button) findViewById(R.id.usersignup1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirm();
            }
        });

    }
    public void confirm() {
        Intent intent1 = new Intent(this, confirm.class);
        startActivity(intent1);
    }

    public void sendMessage(View view)
    {

        Intent intent2 = new Intent( this,confirm.class);
        EditText editText = (EditText) findViewById(R.id.firstname);
        String message = editText.getText().toString();
        intent2.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent2);
    }



}
