package com.example.saksham.viewpager;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Saunack extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_saunack, container, false);


        TextView textView=(TextView)rootView.findViewById(R.id.sau);
        textView.setText("Saunack");
        return rootView;
    }
}
