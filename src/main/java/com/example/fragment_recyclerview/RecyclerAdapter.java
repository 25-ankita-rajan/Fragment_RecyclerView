package com.example.fragment_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    LeftFragment leftFragment;

     int img[]=new int[]{R.drawable.black,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.grey};

   // Context context;
    LayoutInflater inflater;

    public RecyclerAdapter(Context context) {
     //   this.context=context;
        inflater= LayoutInflater.from(context);
    }
    public RecyclerAdapter(){}



    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_items,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.imageView1.setTag(holder);
        holder.imageView1.setImageResource(img[position]);

        holder.imageView1.setOnClickListener(clicklistener);


    }
    View.OnClickListener clicklistener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

        }
    };

    @Override
    public int getItemCount() {
        return 5;
    }
}
