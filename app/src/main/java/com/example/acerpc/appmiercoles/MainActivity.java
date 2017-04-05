package com.example.acerpc.appmiercoles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView vista1;
    Button Button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista1 = (TextView) findViewById(R.id.vista1);
        Button1 = (Button) findViewById(R.id.button);
        Button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        vista1.setText("Cambiamos el texto con el boton");
        Intent intent1 = new Intent(this, Activity2.class);
        startActivity(intent1);
        vista1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
    }
}
