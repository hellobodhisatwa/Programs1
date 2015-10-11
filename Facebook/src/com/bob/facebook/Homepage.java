package com.bob.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Homepage extends Activity {
	
	TextView resultTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homepage);
		
		resultTextView = (TextView) findViewById(R.id.textViewshow);
		
		Intent intent = getIntent();
		Bundle b1 = intent.getExtras();
		String s1 = b1.getString("key1");
		resultTextView.setText("Hello"+" "+s1+" "+"Welcome to Facebook");
	}

}
