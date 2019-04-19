package com.example.yangyang.demo.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yangyang.demo.R;
import com.example.yangyang.demo.data.AccountHelper;
import com.example.yangyang.demo.modle.api.Loginmodle;
import com.example.yangyang.demo.modle.api.UserCard;

public class LoginActivity extends AppCompatActivity implements  View.OnClickListener {

    private EditText CMS_account , CMS_password;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);


        CMS_account = (EditText)findViewById(R.id.edit_account);

        CMS_password = (EditText)findViewById(R.id.edit_password);

        login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(this);

        CMS_password.setOnClickListener(this);
    }


    private void Login(String account,String password){

        Loginmodle loginmodle = new Loginmodle();

        loginmodle.setAccount(account.trim());

        loginmodle.setPassword(password.trim());

        //AccountHelper.login(loginmodle,this);


    }



   /* @Override
    public void Failed(int Res) {
        Toast.makeText(this, "不行啊", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Success(UserCard userCard) {

        Toast.makeText(this, "可以的", Toast.LENGTH_SHORT).show();
        SharedPreferences.Editor editor = getSharedPreferences("isCheckLogin",MODE_PRIVATE).edit();
        editor.putString("account",userCard.getAccount());
        editor.putString("password",userCard.getPassword());
        editor.putString("token",userCard.getToken());
        editor.apply();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();

    }*/

    @Override
    public void onClick(View v) {
        String account = CMS_account.getText().toString().trim();

        String password = CMS_password.getText().toString().trim();

        Login(account,password);

    }
}
