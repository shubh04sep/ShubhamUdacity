package com.shubham.myappprotfolio.activity;

/**
 * Created by jayant on 1/28/16.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.shubham.myappprotfolio.R;

public class BaseActivity extends ActionBarActivity {

    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    }


    protected void setupToolbar(/*int icon,*/ String title) {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            /*mToolbar.setNavigationIcon(icon);*/
            mToolbar.setTitle(title);
            mToolbar.setTitleTextColor(Color.WHITE);
            setSupportActionBar(mToolbar);
        }

        onPostCreate(null, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
