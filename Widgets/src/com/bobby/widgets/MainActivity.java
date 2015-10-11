package com.bobby.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	
	CheckBox selection1,selection2;
	ToggleButton togglebutton;
	Spinner spinnerphones;
	TextView textviewbrand;
	final String[] phones = {"SAMSUNG","LG","MOTO","NOKIA","MI","SONY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] phones = {"SAMSUNG","LG","MOTO","NOKIA","MI","SONY"};
        
        selection1 = (CheckBox) findViewById(R.id.checkBoxselection1);
        selection2 = (CheckBox) findViewById(R.id.checkBoxselection2);
        togglebutton = (ToggleButton) findViewById(R.id.toggleButton);
        spinnerphones = (Spinner) findViewById(R.id.spinnerphone);
        textviewbrand = (TextView) findViewById(R.id.textViewbrand);
        ArrayAdapter ArrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, phones);
        SpinnerAdapter adapter = null;
		spinnerphones.setAdapter(adapter);
		OnItemSelectedListener listener;
		spinnerphones.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				textviewbrand.setText(phones[position]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
        selection1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				
				if(arg1)
				{
					Toast.makeText(MainActivity.this, "Check Box 1 checked", Toast.LENGTH_SHORT).show();
				}
				else if(arg1==false)
				{
					Toast.makeText(MainActivity.this, "Check Box 1 unchecked", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        selection2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(arg1)
				{
					Toast.makeText(MainActivity.this, "Check Box 2 checked", Toast.LENGTH_SHORT).show();
				}
				else if(arg1==false)
				{
					Toast.makeText(MainActivity.this, "Check Box 2 unchecked", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        togglebutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				// TODO Auto-generated method stub
				if(state)
				{
					Toast.makeText(MainActivity.this, "Bluetooth on", Toast.LENGTH_SHORT).show();
				}
				else if(state==false)
				{
					Toast.makeText(MainActivity.this, "Bluetooth off", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        
    }

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	
}

	
		
	

