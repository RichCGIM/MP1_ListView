package com.example.listview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tvRow);
    }

}
