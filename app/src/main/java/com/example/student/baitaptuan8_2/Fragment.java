package com.example.student.baitaptuan8_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Student on 10/9/2018.
 */

public class Fragment extends android.support.v4.app.Fragment {
    private TextView lblFrag;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        lblFrag = (TextView) view.findViewById(R.id.lblFragment);
        Bundle bundle = this.getArguments();
        String x = bundle.getString("text");
        lblFrag.setText(x);
        return view;
    }
}
