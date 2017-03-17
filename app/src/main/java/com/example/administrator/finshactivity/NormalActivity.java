package com.example.administrator.finshactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.finshactivity.Uitl.SildingFinishLayout;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        SildingFinishLayout mSildingFinishLayout = (SildingFinishLayout) findViewById(R.id.activity_normal);
        mSildingFinishLayout
                .setOnSildingFinishListener(new SildingFinishLayout.OnSildingFinishListener() {

                    @Override
                    public void onSildingFinish() {
                        NormalActivity.this.finish();
                    }
                });

        mSildingFinishLayout.setTouchView(mSildingFinishLayout);
    }

    // Press the back button in mobile phone
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.base_slide_right_out);
    }
}
