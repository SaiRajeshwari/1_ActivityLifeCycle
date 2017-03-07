package com.example.rajee.a1_activitylifecycle;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start_b = (Button)findViewById(R.id.start_b);
        btn_start_b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_b = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent_b);
            }
        });

        Button btn_start_dialog = (Button)findViewById(R.id.start_dialog);
        btn_start_dialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1) {
                final Dialog dialog = new Dialog(context);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.simple_dialog);
                Button btn_close_dialog = (Button)dialog.findViewById(R.id.close_dialog);
                btn_close_dialog.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        Button btn_close_app = (Button)findViewById(R.id.close_app);
        btn_close_app.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}
