package com.example.yangyang.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaunchActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        isCheckLogin();
    }

    private void isCheckLogin(){
        SharedPreferences sharedPreferences = getSharedPreferences("isCheckLogin",MODE_PRIVATE);
        String token = sharedPreferences.getString("token",null);
        if (token == null){
            intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }else {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        }

    }

}
