package com.example.apple.viewpageruse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.apple.viewpageruse.gallery.GalleryActivity;
import com.example.apple.viewpageruse.indicater.IndicaterActivity;
import com.example.apple.viewpageruse.scrollable.ScrollableActivity;
import com.example.apple.viewpageruse.showother.ShowOtherActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setJump();
    }

    private void setJump() {
        findViewById(R.id.tv_gallery).setOnClickListener(this);
        findViewById(R.id.tv_showother).setOnClickListener(this);
        findViewById(R.id.tv_indicater).setOnClickListener(this);
        findViewById(R.id.tv_rebound).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_gallery:
                startActivity(new Intent(this, GalleryActivity.class));
                break;
            case R.id.tv_showother:
                startActivity(new Intent(this, ShowOtherActivity.class));
                break;
            case R.id.tv_indicater:
                startActivity(new Intent(this, IndicaterActivity.class));
                break;
            case R.id.tv_rebound:
                startActivity(new Intent(this, ScrollableActivity.class));
                break;
        }
    }
}
