package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class BitmapMirrorFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Mirroring Bitmap";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.bitmap_mirror_layout;
    }
}
