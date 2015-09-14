package com.mutualmobile.shadertest.fragment;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class BitmapOffsetRepeatFragment extends BaseFragment {
    @Override
    public void setString() {
        mTitleString = "Offset Repeating Bitmap";
    }

    @Override
    public void setControl() {
        mSubLayoutResource = R.layout.bitmap_offset_repeat_layout;
    }
}
