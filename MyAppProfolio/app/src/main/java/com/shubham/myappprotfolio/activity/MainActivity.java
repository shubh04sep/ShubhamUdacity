package com.shubham.myappprotfolio.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.shubham.myappprotfolio.R;
import com.shubham.myappprotfolio.utility.Lg;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private Button mSpotifyBtn;
    private Button mScoreAppBtn;
    private Button mLibraryAppBtn;
    private Button mBuilditBiggerBtn;
    private Button mXYZReaderBtn;
    private Button mCapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    /**
     * this method is responsible for initialization of UI components
     */
    private void initUI() {
        mSpotifyBtn = (Button) findViewById(R.id.content_main_spotify_streamer_btn);
        mScoreAppBtn = (Button) findViewById(R.id.content_main_scores_app_btn);
        mLibraryAppBtn = (Button) findViewById(R.id.content_main_library_app_btn);
        mBuilditBiggerBtn = (Button) findViewById(R.id.content_main_build_it_bigger_btn);
        mXYZReaderBtn = (Button) findViewById(R.id.content_main_xyz_reader_btn);
        mCapstoneBtn = (Button) findViewById(R.id.content_main_capstone_btn);
        mSpotifyBtn.setOnClickListener(this);
        mScoreAppBtn.setOnClickListener(this);
        mLibraryAppBtn.setOnClickListener(this);
        mBuilditBiggerBtn.setOnClickListener(this);
        mXYZReaderBtn.setOnClickListener(this);
        mCapstoneBtn.setOnClickListener(this);
        setupToolbar(getString(R.string.lbl_toolbar_myapp_portfolio));
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.content_main_spotify_streamer_btn:
                Lg.showToast(this, getString(R.string.toast_spotify_reder));
                break;
            case R.id.content_main_scores_app_btn:
                Lg.showToast(this, getString(R.string.toast_score_app));
                break;
            case R.id.content_main_library_app_btn:
                Lg.showToast(this, getString(R.string.toast_library_app));
                break;
            case R.id.content_main_build_it_bigger_btn:
                Lg.showToast(this, getString(R.string.toast_build_it_bigger));
                break;
            case R.id.content_main_xyz_reader_btn:
                Lg.showToast(this, getString(R.string.toast_xyz_reader_app));
                break;
            case R.id.content_main_capstone_btn:
                Lg.showToast(this, getString(R.string.toast_capstone_app));
                break;
        }
    }
}
