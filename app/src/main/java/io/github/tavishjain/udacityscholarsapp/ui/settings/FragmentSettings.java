package io.github.tavishjain.udacityscholarsapp.ui.settings;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import io.github.tavishjain.udacityscholarsapp.R;

public class FragmentSettings extends PreferenceFragmentCompat {

    public FragmentSettings(){    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preference_screen);
    }
}