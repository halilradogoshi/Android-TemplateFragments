package com.dovelaqm.templatefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dovelaqm.templatefragments.R;
public class First extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView message= (TextView)view.findViewById(R.id.lblMessage1);
        message.setText("First fragment");
        return view;
    }
}
