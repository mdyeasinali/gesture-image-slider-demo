package com.gitproject.y34h1a.gestureimagesliderdemo.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gitproject.y34h1a.gestureimagesliderdemo.Adapter.CustomSwipeAdpater;
import com.gitproject.y34h1a.gestureimagesliderdemo.R;
import com.gitproject.y34h1a.gestureimagesliderdemo.ViewPager.HackyViewPager;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (HackyViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new CustomSwipeAdpater(this));
    }
}
