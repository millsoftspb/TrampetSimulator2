package com.millsoftspb.trampetsimulator;

import android.support.constraint.motion.MotionLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {
MotionLayout motion_play_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        motion_play_layout = findViewById(R.id.motion_play_container);
        motion_play_layout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                  if (i==R.id.end_scene_playlayout)
                      motion_play_layout.transitionToStart();

            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });
    }

    public void onClick_button1(View view) {
        motion_play_layout.transitionToEnd();

    }

    public void onClick_button3(View view) {
        motion_play_layout.transitionToEnd();
    }

    public void onClick_button2(View view) {
        motion_play_layout.transitionToEnd();
    }
}
