package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class MirrorLinearGradientFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Mirrored Linear Gradient";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.mirror_linear_gradient_layout;
    }
}
