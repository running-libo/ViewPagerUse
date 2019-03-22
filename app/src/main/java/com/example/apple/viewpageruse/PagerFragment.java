package com.example.apple.viewpageruse;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class PagerFragment extends Fragment {
    private int colorResId;
    private FrameLayout frameLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        colorResId = getArguments().getInt("colorResId");
        frameLayout = view.findViewById(R.id.framelayout);
        frameLayout.setBackgroundResource(colorResId);
    }

}
