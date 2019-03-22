package com.example.apple.viewpageruse.scrollable;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * description 可设置可以/不可以滑动的viewpager
 */
public class ScrollableViewPager extends ViewPager {

    private boolean scrollable = true;

    public ScrollableViewPager(Context context) {
        super(context);
    }

    public ScrollableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        if (!scrollable) {
            return false;
        }

        return super.onTouchEvent(ev);
    }

    public boolean isCanScrollble() {
        return scrollable;
    }

    public void setCanScrollble(boolean scrollble) {
        this.scrollable = scrollble;
    }
}
