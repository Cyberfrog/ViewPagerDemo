package com.example.gauravd.viewpagerdemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class screenSlidePage extends Fragment {


    private int[] Stages ={R.string.Stage1,R.string.Stage2,R.string.Stage3,R.string.Stage4,R.string.Stage5};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        String s = getResources().getString(Stages[getArguments().getInt("Stage")]);
        Log.i("Starts",s);
        TextView t=(TextView) rootView.findViewById(R.id.StageContaint);
        t.setText(s);
        return rootView;
    }

}
