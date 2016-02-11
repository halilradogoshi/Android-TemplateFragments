package com.dovelaqm.templatefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.dovelaqm.templatefragments.R;

public class MainActivity extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnClickListener listener = new OnClickListener() {
            public void onClick(View view) {
                Fragment fragment = null;
                if(view == findViewById(R.id.btnFirst)){
                    fragment = new First();
                } else {
                    fragment = new Second();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragmentHolder, fragment);
                transaction.commit();
            }
        };

        Button btn1 = (Button)findViewById(R.id.btnFirst);
        btn1.setOnClickListener(listener);
        Button btn2 = (Button)findViewById(R.id.btnSecond);
        btn2.setOnClickListener(listener);
    }
}