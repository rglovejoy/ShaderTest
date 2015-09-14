package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class BitmapRepeatFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Repeating Bitmap";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.bitmap_repeat_layout;
    }
}
