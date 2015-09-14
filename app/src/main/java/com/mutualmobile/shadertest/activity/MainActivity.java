package com.mutualmobile.shadertest.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.mutualmobile.shadertest.R;
import com.mutualmobile.shadertest.adapter.ShaderAdapter;
import com.mutualmobile.shadertest.fragment.BaseFragment;
import com.mutualmobile.shadertest.fragment.BitmapClampFragment;
import com.mutualmobile.shadertest.fragment.BitmapMirrorFragment;
import com.mutualmobile.shadertest.fragment.BitmapRepeatFragment;
import com.mutualmobile.shadertest.fragment.RainbowFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<BaseFragment> list = new ArrayList<>();
        list.add(new BitmapRepeatFragment());
        list.add(new BitmapMirrorFragment());
        list.add(new BitmapClampFragment());
        list.add(new RainbowFragment());

        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        ShaderAdapter adapter = new ShaderAdapter(getFragmentManager(), list);
        mViewPager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
