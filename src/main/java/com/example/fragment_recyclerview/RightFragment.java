package com.example.fragment_recyclerview;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {


    private static final String ARG_COLOR = "color";

    public static RightFragment newInstance(int color) {

            RightFragment fragment = new RightFragment();
            Bundle args = new Bundle();

            args.putInt(ARG_COLOR,color);
            fragment.setArguments(args);

            return fragment;

        }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.right_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if(getArguments() != null) {
            int color = getArguments().getInt(ARG_COLOR);

            switch (color){

                case Color.BLACK:
                    view.findViewById(R.id.blackView).setBackgroundColor(Color.BLACK);
                    break;
                case Color.RED:
                    view.findViewById(R.id.blackView).setBackgroundColor(Color.RED);
                    break;
                case Color.BLUE:
                    view.findViewById(R.id.blackView).setBackgroundColor(Color.BLUE);
                    break;
                case Color.GREEN:
                    view.findViewById(R.id.blackView).setBackgroundColor(Color.GREEN);
                    break;
                case Color.GRAY:
                    view.findViewById(R.id.blackView).setBackgroundColor(Color.GRAY);
                    break;
            }

        }




    }
}
