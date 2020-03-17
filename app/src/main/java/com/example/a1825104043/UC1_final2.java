package com.example.a1825104043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC1_final2 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1_final2);

        button=findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UC1_final2.this,MainActivity.class);
                startActivity(i);
            }
        });

        button=findViewById(R.id.chuizhi2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(UC1_final2.this,UC1_final.class);
                startActivity(j);
            }
        });

        button=findViewById(R.id.kaozuo2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(UC1_final2.this,UC1_final3.class);
                startActivity(k);
            }
        });

    }
}
