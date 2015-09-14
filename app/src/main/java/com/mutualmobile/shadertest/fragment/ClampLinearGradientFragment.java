package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class ClampLinearGradientFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Clamped Linear Gradient";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.clamp_linear_gradient_layout;
    }
}
