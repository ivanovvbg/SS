package com.example.pc.ss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profil extends AppCompatActivity {
Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        String name= getIntent().getStringExtra("EXTRA_NAME");
        String password= getIntent().getStringExtra("EXTRA_PASSWORD");
       TextView tvName =findViewById(R.id.tvName);
        TextView tvPassword =findViewById(R.id.tvPassword);
        tvName.setText(name);
        tvPassword.setText(password);


        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(profil.this, tree.class));

            }
        });


    }
}




