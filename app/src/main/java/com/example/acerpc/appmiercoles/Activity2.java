package com.example.acerpc.appmiercoles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        backButton = (Button) findViewById(R.id.button2);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onBackPressed();
    }
}
