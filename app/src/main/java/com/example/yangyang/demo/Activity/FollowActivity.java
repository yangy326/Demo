package com.example.yangyang.demo.Activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yangyang.demo.R;
import com.example.yangyang.demo.callback.ToastCall;

public class FollowActivity extends AppCompatActivity implements View.OnClickListener ,ToastCall {

    private String BackLable ;

    private Button lable = null;

    private Button button1 , button2 ,button3 , button4 ,button5 , button6 ,submit;

    private TextView StudentName , ClassName , UserName , OpenClass , CloseClass ;

    private EditText Comment;

    private ImageView close;

    private Button[] buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);

        InitWidget();
    }







    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private String LabelChange(Button button){


        if (lable == null){
            lable = button;
            lable.setBackground(getResources().getDrawable(R.drawable.boder_select));
            return  lable.getText().toString().trim();
        }
        else {
            lable.setBackground(getResources().getDrawable(R.drawable.boder));
            lable = button;
            lable.setBackground(getResources().getDrawable(R.drawable.boder_select));
            return  lable.getText().toString().trim();

        }

    }

    private void InitWidget(){
        button1 = (Button)findViewById(R.id.btn_follow_afterclass);
        button2 = (Button)findViewById(R.id.btn_follow_qingjia);
        button3 = (Button)findViewById(R.id.btn_follow_xufei);
        button4 = (Button)findViewById(R.id.btn_follow_shengji);
        button5 = (Button)findViewById(R.id.btn_follow_goutong);
        button6 = (Button)findViewById(R.id.btn_follow_qita);
        submit = (Button)findViewById(R.id.btn_follow_tijiao);

        StudentName = (TextView)findViewById(R.id.txt_follow_studentname);
        ClassName = (TextView)findViewById(R.id.txt_follow_classname);
        UserName = (TextView)findViewById(R.id.txt_follow_username);
        OpenClass = (TextView)findViewById(R.id.txt_follow_openclass);
        CloseClass = (TextView)findViewById(R.id.txt_follow_closeclass);

        Comment = (EditText)findViewById(R.id.edit_follow_comment);

        close = (ImageView)findViewById(R.id.img_follow_close);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button1.setOnClickListener(this);
        submit.setOnClickListener(this);









    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_follow_afterclass:
                BackLable = LabelChange(button1);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_qingjia:
                BackLable = LabelChange(button2);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_xufei:
                BackLable = LabelChange(button3);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_shengji:
                BackLable = LabelChange(button4);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_goutong:
                BackLable = LabelChange(button5);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_qita:
                BackLable = LabelChange(button6);
                Toast.makeText(this, BackLable, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_follow_tijiao:

                break;



        }

    }

    @Override
    public void showToast() {

    }
}
