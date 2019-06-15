package com.mrlonewolfer.example44;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageViewFragment extends Fragment {

    ArrayList<Integer> imageList;
    Context context;

    private static ViewPager mPager;
    public ImageViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_image_view, container, false);

        preparedData();
        mPager = (ViewPager) view.findViewById(R.id.pager);
        ImageViewAdapter imageViewAdapter=new ImageViewAdapter(context,imageList);
        mPager.setAdapter(imageViewAdapter);
        return view;
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
