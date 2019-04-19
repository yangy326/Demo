package com.example.yangyang.demo.Activity;

import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yangyang.demo.widget.DiffCallBack;
import com.example.yangyang.demo.R;
import com.example.yangyang.demo.TestData.Student;
import com.example.yangyang.demo.widget.ContacterAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView recyclerView;

    boolean canflash = false;

    ContacterAdapter adapter;

    private SwipeRefreshLayout swipeRefreshLayout;

    private List<Student> list = new ArrayList<>();

    private List<Student> newlist = new ArrayList<>();

    private static final int H_CODE_UPDATE = 1;
    private List<Student> mNewDatas;//增加一个变量暂存newList
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case H_CODE_UPDATE:
                    //取出Result
                    DiffUtil.DiffResult diffResult = (DiffUtil.DiffResult) msg.obj;
                    diffResult.dispatchUpdatesTo(adapter);
                    //别忘了将新数据给Adapter
                    list = newlist;
                    adapter.set(list);
                    break;
            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.SwipeRefreshLayout);
        recyclerView = (RecyclerView)findViewById(R.id.recycleView);

        initStudent();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
         adapter =  new ContacterAdapter(list);
        recyclerView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(this);
    }


    void initStudent(){
        for (int i = 0 ; i < 20 ; i ++){

            Student student = new Student("小敏夫",i,"莉莉安",i*4,1,"4天前");
            Student student1 = new Student("小敏夫",i,"莉莉安",i*4,1,"5天前");
            list.add(student);
            newlist.add(student1);

        }



    }

    @Override
    public void onRefresh() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new DiffCallBack(list, newlist), true);
                Message message = mHandler.obtainMessage(H_CODE_UPDATE);
                message.obj = diffResult;//obj存放DiffResult
                message.sendToTarget();
                swipeRefreshLayout.setRefreshing(false);




            }
        }).start();

    }
}
