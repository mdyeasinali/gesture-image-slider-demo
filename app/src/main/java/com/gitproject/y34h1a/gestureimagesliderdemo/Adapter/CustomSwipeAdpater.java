package com.gitproject.y34h1a.gestureimagesliderdemo.Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gitproject.y34h1a.gestureimagesliderdemo.R;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by y34h1a on 1/16/16.
 */
    public class CustomSwipeAdpater extends PagerAdapter {
        private int[] image_resources = {R.drawable.linux_mint_1,R.drawable.linux_mint_2};
        private Context context;
        private LayoutInflater inflater;
        PhotoViewAttacher mAttacher;
        PhotoView imageView;

    public CustomSwipeAdpater(Context context){
            this.context = context;
        }

        @Override
        public int getCount() {
            return image_resources.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View item_view = inflater.inflate(R.layout. swipe_layout,container,false);

            imageView = (PhotoView) item_view.findViewById(R.id.ivSliderImage);
            imageView.setImageResource(image_resources[position]);

            container.addView(item_view);
            return item_view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
