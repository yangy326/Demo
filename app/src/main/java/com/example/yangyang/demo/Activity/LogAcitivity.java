package com.example.yangyang.demo.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yangyang.demo.R;
import com.example.yangyang.demo.TestData.Student;
import com.example.yangyang.demo.TestData.follow;
import com.example.yangyang.demo.widget.ContacterAdapter;
import com.example.yangyang.demo.widget.FollowCommentAdapter;

import java.util.ArrayList;
import java.util.List;

public class LogAcitivity extends AppCompatActivity {
    RecyclerView recyclerView;

    FollowCommentAdapter adapter;

    private List<follow> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_acitivity);

        recyclerView = (RecyclerView)findViewById(R.id.log_recycleView);

        initfollow();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter =  new FollowCommentAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void initfollow() {
        for (int i = 0 ; i < 20 ; i ++){

           follow follow = new follow(null, null,   1 ,1, 1, null, null);
            list.add(follow);


        }
    }
}
