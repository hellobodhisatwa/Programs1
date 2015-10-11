package com.bobby.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Spinner spinnerphones;
	TextView textviewbrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] Phones = {"SAMSUNG","LG","MOTO","SONY","MI","HTC","MICROMAX"};
        
        spinnerphones = (Spinner) findViewById(R.id.spinnerphones);
        textviewbrand = (TextView) findViewById(R.id.textViewbrand);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Phones);
        
        spinnerphones.setAdapter(adapter);
        
        spinnerphones.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				textviewbrand.setText(Phones[position]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }
    
}
