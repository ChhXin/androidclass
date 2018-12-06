package edu.fjnu.cse.androidclass4;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by 14334 on 2017/4/11.
 */
public class ActionActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.action_preferences);
    }
}
