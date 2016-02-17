package com.carouseldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.carouseldemo.utils.DisplayUtils;
import com.carouseldemo.view.viewpager.SlideShowView;

import java.util.ArrayList;
import java.util.List;

public class CarouselDemoActivity extends AppCompatActivity {
    SlideShowView slideShowView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel_demo);
        slideShowView = (SlideShowView) findViewById(R.id.home_ad_view);
        ViewGroup.LayoutParams lp = slideShowView.getLayoutParams();
        lp.width = DisplayUtils.getScreenWidth(this);
        lp.height = DisplayUtils.getScreenHeight(this) / 4;
        slideShowView.setLayoutParams(lp);
        List<String> adList = new ArrayList<>();
        adList.add("http://pic.nipic.com/2008-01-05/200815191150944_2.jpg");
        adList.add("http://pic1.nipic.com/2009-02-19/200921922311483_2.jpg");
        adList.add("http://pic.nipic.com/2008-04-30/2008430112252842_2.jpg");
        slideShowView.setImageUris(this, adList, imageCycleViewListener);
    }

    private SlideShowView.ImageCycleViewListener imageCycleViewListener = new SlideShowView.ImageCycleViewListener() {
        @Override
        public void onImageClick(int position, View imageView) {
//            轮播图片item点击事件
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        if (slideShowView != null) {
            slideShowView.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (slideShowView != null) {
            slideShowView.onPause();
        }
    }
}
