package com.example.rajee.a1_activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn_finish_b = (Button)findViewById(R.id.close_b);
        btn_finish_b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SecondActivity.this.finish();
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
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
