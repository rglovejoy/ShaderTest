package com.mutualmobile.shadertest.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.util.Log;

import com.mutualmobile.shadertest.fragment.BaseFragment;

import java.util.List;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class ShaderAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mShaderList;

    public ShaderAdapter(FragmentManager fm, List<BaseFragment> items) {
        super(fm);

        mShaderList = items;
    }

    @Override
    public Fragment getItem(int position) {
        return mShaderList.get(position);
    }

    @Override
    public int getCount() {
        Log.i("ShaderAdapter", String.format("shader count = %d", mShaderList.size()));
        return mShaderList.size();
    }
}
