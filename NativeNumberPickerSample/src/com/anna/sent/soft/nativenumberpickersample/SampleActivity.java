package com.anna.sent.soft.nativenumberpickersample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SampleActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_samples);

		findViewById(R.id.btnDark1).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								DarkThemeActivity1.class));
					}
				});

		findViewById(R.id.btnLight1).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								LightThemeActivity1.class));
					}
				});

		findViewById(R.id.btnDark2).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								DarkThemeActivity2.class));
					}
				});

		findViewById(R.id.btnLight2).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								LightThemeActivity2.class));
					}
				});
	}
}
