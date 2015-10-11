package com.bobby.buttons;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	
	RadioButton option1RadioButton,option2RadioButton;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        option1RadioButton = (RadioButton) findViewById(R.id.radioButtonoption1);
        option2RadioButton = (RadioButton) findViewById(R.id.radioButtonoption2);
        
        option1RadioButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				if(isChecked)
				{
					Toast.makeText(MainActivity.this, "Option 1 selected", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        
        option2RadioButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				
				if(isChecked)
				{
					Toast.makeText(MainActivity.this, "Option 2 selected", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
    }


	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		

		
	}
}
