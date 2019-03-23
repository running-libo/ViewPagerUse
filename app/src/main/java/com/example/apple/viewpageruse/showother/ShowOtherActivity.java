package com.example.apple.viewpageruse.showother;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.apple.viewpageruse.MyFragmentPagerAdapter;
import com.example.apple.viewpageruse.PagerFragment;
import com.example.apple.viewpageruse.R;

import java.util.ArrayList;

public class ShowOtherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] pages = {"", "", ""};
    private int[] colorResId = {R.color.yellow, R.color.purple, R.color.blue};
    private PagerFragment pagerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_other);

        for (int i = 0; i < pages.length; i++) {
            Bundle bundle = new Bundle();
            bundle.putInt("colorResId", colorResId[i]);
            pagerFragment = new PagerFragment();
            pagerFragment.setArguments(bundle);
            fragments.add(pagerFragment);
        }

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), fragments, pages));
        viewPager.setPageMargin(50);
        viewPager.setOffscreenPageLimit(2);
    }
}
