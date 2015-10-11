package com.bobby.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class SecActivity extends Activity {
	
	TextView Null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);
		Null = (TextView) findViewById(R.id.textViewcaption);
		Null.setText("onCreate");
		Toast.makeText(SecActivity.this, "onCreate()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Null.setText("onStart");
		Toast.makeText(SecActivity.this, "onStart()", Toast.LENGTH_SHORT).show();
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Null.setText("onResume");
		Toast.makeText(SecActivity.this, "onResume()", Toast.LENGTH_SHORT).show();
	}
}
