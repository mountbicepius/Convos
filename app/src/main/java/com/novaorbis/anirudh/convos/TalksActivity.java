package com.novaorbis.anirudh.convos;

import android.os.Bundle;
import android.app.Activity;

public class TalksActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talks);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}