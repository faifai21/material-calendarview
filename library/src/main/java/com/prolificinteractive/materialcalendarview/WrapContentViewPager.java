package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by faisal-alqadi on 2/23/15.
 */
public class WrapContentViewPager extends ViewPager{
    public WrapContentViewPager(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(getChildCount() == 0){
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        View child;
        if(getChildCount() == 1)
            child = getChildAt(0);
        else if(getChildCount() == 2)
            child = getChildAt(0);
        else
            child = getChildAt((getChildCount()-1)/2);
        child.measure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED));
        int height = child.getMeasuredHeight();

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


}
