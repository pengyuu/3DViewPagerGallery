package com.example.evanzeng.viewpagertest.ViewPager;

import android.graphics.Camera;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.evanzeng.viewpagertest.util.ViewHelper;

/**
 * Created by Evan Zeng on 2016/8/18.
 */

public class MyTransformation implements ViewPager.PageTransformer {

    private static final float MIN_SCALE=1f;
    private static final float MIN_ALPHA=0.5f;
    private static final float MAX_ROTATE=30;
    private Camera camera=new Camera();
    @Override
    public void transformPage(View view, float position) {
//        float centerX=page.getWidth()/2;
//        float centerY=page.getHeight()/2;
        float scaleFactor=Math.max(MIN_SCALE,1-Math.abs(position));
        float rotate=20*Math.abs(position);
        if (position<-1){

        }else if (position<0){
//            page.setScaleX(scaleFactor);
//            page.setScaleY(scaleFactor);
//            page.setRotationY(rotate);
            ViewHelper.setPivotX(view, view.getMeasuredWidth() * 0.5f);
            ViewHelper.setPivotY(view, view.getMeasuredHeight());
        }else if (position>=0&&position<1){
//            page.setScaleX(scaleFactor);
//            page.setScaleY(scaleFactor);
//            page.setRotationY(-rotate);
        }
        else if (position>=1) {
//            page.setScaleX(scaleFactor);
//            page.setScaleY(scaleFactor);
//            page.setRotationY(-rotate);
        }
    }
}
