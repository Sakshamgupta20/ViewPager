package com.example.saksham.viewpager;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class two extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_two, container, false);


        TextView textView=(TextView)rootView.findViewById(R.id.two);
        textView.setText("Gupta");
        return rootView;
    }
}
