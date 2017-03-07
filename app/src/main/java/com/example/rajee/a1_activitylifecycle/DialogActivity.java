package com.example.rajee.a1_activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);

        Button btn_finish_dialog = (Button)findViewById(R.id.close_dialog);
        btn_finish_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                DialogActivity.this.finish();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        MainActivity.thread_count++;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
