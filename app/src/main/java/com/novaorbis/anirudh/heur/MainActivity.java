package com.novaorbis.anirudh.heur;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    public  boolean isAuth;

    public void setAuth(boolean auth) {
        isAuth = auth;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar pb =findViewById(R.id.loaden);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.floatatin);
        findViewById(R.id.header).setAnimation(hyperspaceJumpAnimation);
        assert pb !=null;
        pb.isIndeterminate();

        // Using handler with postDelayed called runnable run method
        // Using background task to verify existence of user
        new Handler().postDelayed(() -> {
            SharedPreferences sharedPreferences =
                    PreferenceManager.getDefaultSharedPreferences(this);
            // Check if we need to display our OnboardingFragment
            /*if (!sharedPreferences.getBoolean(
                    MyOnboardingFragment.COMPLETED_ONBOARDING_PREF_NAME, false)) {
                // The user hasn't seen the OnboardingFragment yet, so show it
                startActivity(new Intent(this, OnboardingActivity.class));
            }*/
             Intent i = new Intent(MainActivity.this, VerifyActivity.class);
                startActivity(i);

           // }
            //Intent intent =new Intent(MainActivity.this, TalksActivity.class);
            //startActivityForResult(intent,1);
            // close this activity
            finish();
        }, 1000);

    }

}
