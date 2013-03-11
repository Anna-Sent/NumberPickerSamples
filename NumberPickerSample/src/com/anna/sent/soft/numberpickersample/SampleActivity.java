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

		findViewById(R.id.btnDarkNumberPicker).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								DarkNumberPickerThemeActivity.class));
					}
				});

		findViewById(R.id.btnDarkNumberPickerWithSelectorWheel)
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(
								SampleActivity.this,
								DarkNumberPickerWithSelectorWheelThemeActivity.class));
					}
				});

		findViewById(R.id.btnLightNumberPicker).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(SampleActivity.this,
								LightNumberPickerThemeActivity.class));
					}
				});

		findViewById(R.id.btnLightNumberPickerWithSelectorWheel)
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						startActivity(new Intent(
								SampleActivity.this,
								LightNumberPickerWithSelectorWheelThemeActivity.class));
					}
				});
	}
}
