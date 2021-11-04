package com.example.myfrgment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button LlmarFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LlmarFragment=(Button) findViewById(R.id.btnLlamar);
        LlmarFragment.setOnClickListener(this::onClick);

        //getSupportFragmentManager().beginTransaction().add(R.id.container,new FirstFragment()).commit();
    }
    public void onClick(View view){
        if (view.getId()==R.id.btnLlamar){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new FirstFragment()).commit();
            LlmarFragment.setVisibility(View.GONE);
        }

    }
}