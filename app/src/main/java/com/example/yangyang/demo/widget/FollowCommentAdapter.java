package com.example.yangyang.demo.widget;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.yangyang.demo.R;
import com.example.yangyang.demo.TestData.follow;

import java.util.List;

public class FollowCommentAdapter extends RecyclerView.Adapter<FollowCommentAdapter.ViewHolder>{

    private List<follow> list ;

    public FollowCommentAdapter(List<follow> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater
                .from(viewGroup.getContext())
                .inflate(R.layout.item_follow,viewGroup,false);
        FollowCommentAdapter.ViewHolder holder = new FollowCommentAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        follow follows = list.get(i);
        if (follows.getIsgetphone() == 2){
            viewHolder.label.setVisibility(View.GONE);
            viewHolder.comment.setVisibility(View.GONE);
            viewHolder.media.setVisibility(View.GONE);
            }
            else {
            if (follows.getIslabel() == 2){

                viewHolder.label.setVisibility(View.GONE);
            }




        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        //View view;
        TextView time,username,label,comment,processtime;
        ImageView play;
        ProgressBar voice;
        LinearLayout media ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //view = itemView;
            media = (LinearLayout)itemView.findViewById(R.id.media);
            username = (TextView)itemView.findViewById(R.id.txt_item_username);
            label = (TextView)itemView.findViewById(R.id.txt_item_label);
            time = (TextView)itemView.findViewById(R.id.txt_item_time);
            comment = (TextView)itemView.findViewById(R.id.txt_item_comment);
            processtime = (TextView)itemView.findViewById(R.id.txt_item_process);

            play = (ImageView)itemView.findViewById(R.id.img_item_play);

            voice = (ProgressBar)itemView.findViewById(R.id.bar_item_voice);






        }
    }
}
