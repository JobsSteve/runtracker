package com.fiixed.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by abell on 2/4/14.
 */
public class TrackingLocationReceiver extends LocationReceiver {

    @Override
    protected void onLocationReceived(Context context, Location loc) {
        RunManager.get(context).insertLocation(loc);
    }
}
