package com.millsoftspb.trampetsimulator;

import android.content.Intent;
import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {
MotionLayout activity_start_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        activity_start_layout = findViewById(R.id.activity_start_start);
    }

    @Override
    protected void onStart() {
        super.onStart();
        activity_start_layout.transitionToEnd();
    }

    public void start_play(View view) {
        Intent intent= new Intent(this,PlayActivity.class);
        startActivity(intent);
    }

    public void start_settings(View view) {
        Intent intent= new Intent(this,SettingActivity.class);
        startActivity(intent);
    }
}
