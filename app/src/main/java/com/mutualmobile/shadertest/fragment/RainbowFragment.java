package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class RainbowFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Rainbow";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.rainbow_layout;
    }
}
