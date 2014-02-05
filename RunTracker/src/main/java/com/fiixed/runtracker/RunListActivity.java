package com.fiixed.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by abell on 2/4/14.
 */
public class RunListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
