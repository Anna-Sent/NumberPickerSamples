package com.anna.sent.soft.numberpickersample;

import com.anna.sent.soft.numberpickerlibrary.NumberPicker;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
	public final static String EXTRA_THEME_ID = "themeId";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(getIntent().getIntExtra(EXTRA_THEME_ID, 0));

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity);

		setNumberPickerProperties();
	}

	private void setNumberPickerProperties() {

		NumberPicker np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setMaxValue(20);
		np1.setMinValue(0);

		NumberPicker np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setMaxValue(20);
		np2.setMinValue(0);
	}
}
