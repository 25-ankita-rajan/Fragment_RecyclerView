package com.example.fragment_recyclerview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LeftFragment  extends Fragment {

    OnColorChooseListener mOnColorChooseListener;

    RecyclerView recyclerView;
   // int img[]=new int[]{R.drawable.black,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.grey};


    public static LeftFragment newInstance() {

        LeftFragment fragment = new LeftFragment();
        return fragment;
    }
    public LeftFragment(){}


    public void onAttach(Context context) {
        super.onAttach(context);
        mOnColorChooseListener = (OnColorChooseListener) context;  // MainActivity.this
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d("tag","We are in  left fragment onCreateView..");



        return inflater.inflate(R.layout.left_fragment_recyclerview, container, false);  // 11cf...
    }
    /// 4
    @Override //                    11cf
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        ;
//
//        Log.d("tag","We are in  left fragment onViewCreated..");
//
//
//
//        //                              11cf.
////        Button redButton   = (Button)   view.findViewById(R.id.redButton); //lets get the handle of our buttons
////        Button greenButton = (Button)   view.findViewById(R.id.greenButton);
////        Button blueButton  = (Button)   view.findViewById(R.id.blueButton);
////        Button buttonRemoveRightFragment  = (Button)   view.findViewById(R.id.buttonRemoveFragment);
////          ImageView imageView1 = (ImageView) view.findViewById(R.id.imageViewBlack);
////          ImageView imageView2 = (ImageView) view.findViewById(R.id.imageViewRed);
////          ImageView imageView3 = (ImageView) view.findViewById(R.id.imageViewBlue);
////          ImageView imageView4 = (ImageView) view.findViewById(R.id.imageViewGreen);
////          ImageView imageView5 = (ImageView) view.findViewById(R.id.imageViewGray);
//
//
//        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
////          imageView1.setOnClickListener(this);
////          imageView2.setOnClickListener(this);
////          imageView3.setOnClickListener(this);
////          imageView4.setOnClickListener(this);
////          imageView5.setOnClickListener(this);
//
//        RecyclerAdapter adapter = new RecyclerAdapter(this);
//
//        recyclerView.setAdapter(adapter);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
    }

    @Override
    public void onDestroy() {
        mOnColorChooseListener = null;
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageViewBlack:
                Log.d("tag","We are in  left fragment User Clicked on RED..");
                updateDisplay(Color.BLACK);  // call notifyer

                break;
            case R.id.imageViewRed:
                Log.d("tag","We are in  left fragment User Clicked on GREEN..");
                updateDisplay(Color.RED);
                break;
            case R.id.imageViewBlue:
                Log.d("tag","We are in  left fragment User Clicked on BLUE..");
                updateDisplay(Color.BLUE);
                break;
            case R.id.imageViewGreen:
                Log.d("tag","We are in  left fragment User Clicked on BLUE..");
                updateDisplay(Color.GREEN);
                break;
            case R.id.imageViewGray:
                Log.d("tag","We are in  left fragment User Clicked on BLUE..");
                updateDisplay(Color.GRAY);
                break;


        }
    }

    private void updateDisplay(int color) {
        if (mOnColorChooseListener != null) {
            Log.d("tag","We are in  left fragment Calling update method to fallback on main activity.");
            mOnColorChooseListener.onColorChosen(color);
            // this( MainActivity).onColorChosen( color);
        }
    }


    }



    public interface OnColorChooseListener {
        void onColorChosen(int color);
    }

