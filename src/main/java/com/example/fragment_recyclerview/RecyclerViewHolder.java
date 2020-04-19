package com.example.fragment_recyclerview;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView1;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

         imageView1 = (ImageView) itemView.findViewById(R.id.imageViewBlack);

    }
}
