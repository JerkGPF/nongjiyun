package com.example.administrator.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.administrator.myapplication.R;

public class Exemplary_typical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_exemplary_typical);
//        if (getSupportActionBar()!=null){
//            getSupportActionBar().hide();
//        }
    }
}
