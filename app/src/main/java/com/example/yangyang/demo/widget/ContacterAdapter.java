package com.example.yangyang.demo.widget;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yangyang.demo.Activity.LogAcitivity;

import com.example.yangyang.demo.R;
import com.example.yangyang.demo.TestData.Student;
import com.example.yangyang.demo.service.MyService;

import java.util.List;

public class ContacterAdapter extends RecyclerView.Adapter<ContacterAdapter.ViewHolder> {

    private List<Student> mlist ;
    public void set(List<Student> list){
        mlist = list;
    }


    public ContacterAdapter(List<Student> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.recycle_item,viewGroup,false);
       final ViewHolder holder = new ViewHolder(view);
       holder.view.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {




               Intent intent3 = new Intent(v.getContext(), MyService.class);
               v.getContext().startService(intent3);
               Intent intent = new Intent();

               intent.setAction(Intent.ACTION_CALL);
               intent.setData(Uri.parse("tel:" + "15989046336"));
               v.getContext().startActivity(intent);

           }
       });
       holder.Interpretation.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(v.getContext(), LogAcitivity.class);
               v.getContext().startActivity(intent);
           }
       });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Student student = mlist.get(i);


        viewHolder.StudentName.setText(student.getName());
        viewHolder.StudentID.setText(String.valueOf(student.getId()));
        viewHolder.ClassID.setText(student.getTeachername() + student.getClassid());
        if (student.getIscontact() == 1){
            viewHolder.ContactTime.setText("最近联系时间   " + student.getContacttime() );
        }
        else {
            viewHolder.ContactTime.setText("最近未联系" );
        }


    }


    @Override
    public int getItemCount() {
        return mlist.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        View view;
        TextView StudentName,ClassID,StudentID,ContactTime;
        ImageView Interpretation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            StudentName = (TextView)itemView.findViewById(R.id.txt_studentname);
            ClassID = (TextView)itemView.findViewById(R.id.txt_classid);
            StudentID = (TextView)itemView.findViewById(R.id.txt_studentid);
            ContactTime = (TextView)itemView.findViewById(R.id.txt_contacttime);
            Interpretation = (ImageView) itemView.findViewById(R.id.img_shuoming);
        }
    }
}
