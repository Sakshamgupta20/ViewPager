package com.example.saksham.viewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class one extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_one, container, false);


        TextView textView=(TextView)rootView.findViewById(R.id.one);
        textView.setText("Saksham");
        return rootView;
    }
}
