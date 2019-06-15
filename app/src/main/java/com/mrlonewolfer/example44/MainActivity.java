package com.mrlonewolfer.example44;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> imageList;


    private static ViewPager mPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preparedData();
            init();

    }

    private void init() {
        mPager = (ViewPager) findViewById(R.id.pager);
        ImageViewAdapter imageViewAdapter=new ImageViewAdapter(this,imageList);
        mPager.setAdapter(imageViewAdapter);
    }

    private void preparedData() {
        imageList= new ArrayList<>();
        imageList.add(R.drawable.a);
        imageList.add(R.drawable.b);
        imageList.add(R.drawable.c);
        imageList.add(R.drawable.d);
        imageList.add(R.drawable.e);
        imageList.add(R.drawable.f);
        imageList.add(R.drawable.g);
        imageList.add(R.drawable.h);
    }

}
