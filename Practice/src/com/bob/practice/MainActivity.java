package com.bob.practice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	
	ToggleButton onToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        onToggleButton = (ToggleButton) findViewById(R.id.toggleButtonwifi);
        
        onToggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				// TODO Auto-generated method stub
				
				if(state)
				{
					Toast.makeText(MainActivity.this, "Wi-fi on", Toast.LENGTH_SHORT).show();
				}
				
				else if(!state)
				{
					Toast.makeText(MainActivity.this, "Wi-fi off", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
    }

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}
    
}
