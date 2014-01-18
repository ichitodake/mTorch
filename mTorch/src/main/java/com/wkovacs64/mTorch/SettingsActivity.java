package com.wkovacs64.mTorch;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.Log;

public class SettingsActivity extends PreferenceActivity {

    private static final String TAG = SettingsActivity.class.getSimpleName();

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "********** Settings **********");

        setTitle(getString(R.string.app_name) + " " + getString(R.string.menu_settings));
        addPreferencesFromResource(R.xml.settings);
    }
}