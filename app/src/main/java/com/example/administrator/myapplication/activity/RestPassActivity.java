package com.example.administrator.myapplication.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.myapplication.R;

public class RestPassActivity extends AppCompatActivity {
    private ImageView reister_back_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_pass);
        SharedPreferences sp=getSharedPreferences("admin",MODE_PRIVATE);
        reister_back_bt=(ImageView)findViewById(R.id.reister_back_bt);
        reister_back_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
