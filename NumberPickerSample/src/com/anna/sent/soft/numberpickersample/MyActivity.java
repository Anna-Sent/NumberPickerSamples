package com.anna.sent.soft.numberpickersample;

import com.anna.sent.soft.numberpickerlibrary.NumberPicker;

import android.app.Activity;

public class MyActivity extends Activity {
	protected void setNumberPickerProperties() {
		NumberPicker np1 = (NumberPicker) findViewById(R.id.numberPicker1);
		np1.setMaxValue(20);
		np1.setMinValue(0);
		np1.setFocusable(true);
		np1.setFocusableInTouchMode(true);

		NumberPicker np2 = (NumberPicker) findViewById(R.id.numberPicker2);
		np2.setMaxValue(20);
		np2.setMinValue(0);
		np2.setFocusable(true);
		np2.setFocusableInTouchMode(true);
	}
}
