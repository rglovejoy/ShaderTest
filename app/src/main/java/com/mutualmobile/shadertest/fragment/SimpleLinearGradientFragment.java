package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class SimpleLinearGradientFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Simple Gradient";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.simple_linear_gradient_layout;
    }
}
