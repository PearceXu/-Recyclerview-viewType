package com.madun.yeehaw.adapter.viewHolder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by xubaipei on 2016/9/19.
 */
public class ComHolder<T> extends RecyclerView.ViewHolder {
    private View mView;
    Context mContext;
    public ComHolder(Context context, ViewGroup parent,int layoutId){
        this(LayoutInflater.from(context).inflate(layoutId,parent,false));
        mContext = context;
    }
    public ComHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void setText(int id,String str){
        TextView textView = (TextView)mView.findViewById(id);
        textView.setText(str);
    }
    public void setImageView(int id,int resId){
        ImageView imageView = (ImageView)mView.findViewById(id);
        if (imageView != null)
            imageView.setImageResource(resId);
    }
    public void loadNetImage(int id,String url){
        ImageView imageView = (ImageView)mView.findViewById(id);
        if (imageView != null)
            Glide.with(mContext).load(url).into(imageView);
    }
    public void setOnClickListener(int id, View.OnClickListener clickListener){
        View view = (View)mView.findViewById(id);
        if (view != null)
            view.setOnClickListener(clickListener);
    }
}
