package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class ModifiedRainbowLinearGradientFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Modified Rainbow Linear Gradient";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.modified_rainbow_linear_gradient_layout;
    }
}
