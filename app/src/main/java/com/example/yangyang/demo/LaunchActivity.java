package com.example.yangyang.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.yangyang.demo.Activity.LoginActivity;
import com.example.yangyang.demo.Activity.MainActivity;
import com.example.yangyang.demo.Activity.PermissionActivity;

public class LaunchActivity extends PermissionActivity {
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
        finish();

    }

}
