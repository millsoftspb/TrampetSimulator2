package com.millsoftspb.trampetsimulator;

import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
MotionLayout activity_start_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        activity_start_layout = findViewById(R.id.activity_start);
    }

    @Override
    protected void onStart() {
        super.onStart();
        activity_start_layout.transitionToEnd();
    }
}
