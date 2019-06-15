package com.mrlonewolfer.example44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageViewAdapter extends PagerAdapter {
    ArrayList<Integer> imageList;
    private LayoutInflater inflater;
    Context context;
    public ImageViewAdapter(Context context, ArrayList<Integer> imageList) {
        this.context=context;
        this.imageList=imageList;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup view, int position) {
        View myImageLayout=inflater.inflate(R.layout.image_slide,view,false);
        ImageView imageView=(ImageView) myImageLayout.findViewById(R.id.image);
        imageView.setImageResource(imageList.get(position));
        view.addView(myImageLayout,0);


        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
