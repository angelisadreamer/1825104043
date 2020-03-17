package com.example.a1825104043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC1_final3 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1_final3);

        button=findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(UC1_final3.this,MainActivity.class);
                startActivity(i);
            }
        });

        button=findViewById(R.id.shuiping3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(UC1_final3.this,UC1_final2.class);
                startActivity(j);
            }
        });

        button=findViewById(R.id.chuizhi3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(UC1_final3.this,UC1_final.class);
                startActivity(k);
            }
        });
    }
}
