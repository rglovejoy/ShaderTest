package com.mutualmobile.shadertest.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public abstract class BaseFragment extends Fragment {

    protected String mTitleString = null;
    protected int mSubLayoutResource = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_base, container, false);

        setString();
        if (mTitleString != null) {
            TextView titleView = (TextView) view.findViewById(R.id.title);
            titleView.setText(mTitleString);
        }

        setControl();
        if (mSubLayoutResource != -1) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frame_layout);
            View subView = inflater.inflate(mSubLayoutResource, container, false);
            frameLayout.addView(subView);
        }

        return view;
    }

    public abstract void setString();
    public abstract void setControl();
}

