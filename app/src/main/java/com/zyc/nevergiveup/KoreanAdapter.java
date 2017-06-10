package com.zyc.nevergiveup;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by zyc on 2017/6/7.
 */

public class KoreanAdapter extends RecyclerView.Adapter<KoreanAdapter.ViewHolder> {
    private Context mContext;
    private List<Korean> mKoreanList;
    class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView koreanImage;
        TextView koreanName;
        public ViewHolder(View view){
            super(view);
            cardView=(CardView)view;
            koreanImage=(ImageView)view.findViewById(R.id.korean_image);
            koreanName=(TextView)view.findViewById(R.id.korean_name);
        }
    }
    public KoreanAdapter(List<Korean>koreanList){
        mKoreanList=koreanList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        if(mContext==null){
            mContext=parent.getContext();
        }
        View view=LayoutInflater.from(mContext).inflate(R.layout.korean_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                Korean korean=mKoreanList.get(position);
                Intent intent=new Intent(mContext,KoreanAcitvity.class);
                intent.putExtra(KoreanAcitvity.KOREAN_NAME,korean.getName());
                intent.putExtra(KoreanAcitvity.KOREAN_IMAGE_ID,korean.getImageId());
                mContext.startActivity(intent);
            }
        });
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Korean korean=mKoreanList.get(position);
        holder.koreanName.setText(korean.getName());
        Glide.with(mContext).load(korean.getImageId()).into(holder.koreanImage);
    }
    @Override
    public int getItemCount(){
        return mKoreanList.size();
    }


    }

