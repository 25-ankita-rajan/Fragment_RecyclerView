package com.example.fragment_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements LeftFragment.OnColorChooseListener {

    RecyclerView recyclerView;

    LeftFragment leftFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftFragment =LeftFragment.newInstance();
    }



    @Override
    public void onColorChosen(int color) {

        RightFragment rightFragment =  RightFragment.newInstance(color);

        switch (color){
            case Color.BLACK:

                 getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer,rightFragment).commit();
                break;
            case Color.RED:
                getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer,rightFragment).commit();
                break;
            case Color.BLUE:
                getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer,rightFragment).commit();
                break;
            case Color.GREEN:
                getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer,rightFragment).commit();
                break;
            case Color.GRAY:
                getSupportFragmentManager().beginTransaction().replace(R.id.rightFragmentContainer,rightFragment).commit();
                break;

        }

    }
}
