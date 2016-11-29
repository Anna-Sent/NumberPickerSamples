package com.anna.sent.soft.numberpickersample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples);

        findViewById(R.id.btnDarkTheme).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SampleActivity.this,
                                MyActivity.class).putExtra(
                                MyActivity.EXTRA_THEME_ID, R.style.DarkTheme));
                    }
                });

        findViewById(R.id.btnLightTheme).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SampleActivity.this,
                                MyActivity.class).putExtra(
                                MyActivity.EXTRA_THEME_ID, R.style.LightTheme));
                    }
                });

        findViewById(R.id.btnDarkHoloTheme).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SampleActivity.this,
                                MyActivity.class).putExtra(
                                MyActivity.EXTRA_THEME_ID,
                                R.style.DarkHoloTheme));
                    }
                });

        findViewById(R.id.btnLightHoloTheme).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(SampleActivity.this,
                                MyActivity.class).putExtra(
                                MyActivity.EXTRA_THEME_ID,
                                R.style.LightHoloTheme));
                    }
                });
    }
}
