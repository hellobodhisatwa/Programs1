package com.bobby.unitconverter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	Spinner optionsSpinner;
	EditText input1EditText,input2EditText;
	Button converterButton;
	Button clearButton;
	TextView resultTextView;
    double KM,M,INR,USD;
	double CEL;
	double FAR;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final  String[] options = {"Choose one Unit","Temperature","Currency","Distance"};
        
        optionsSpinner = (Spinner) findViewById(R.id.spinneroptions);
        input1EditText = (EditText) findViewById(R.id.editTextinput1);
        input2EditText = (EditText) findViewById(R.id.editTextinput2);
        converterButton = (Button) findViewById(R.id.buttonconvert);
        resultTextView = (TextView) findViewById(R.id.textViewresult);
        clearButton = (Button) findViewById(R.id.buttonclear);
        
  
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, options);
        optionsSpinner.setAdapter(adapter);
        optionsSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub
				
				switch(pos)
				{
				case 0:
					clear();
					input1EditText.setText("");
					input2EditText.setText("");
					break;
					
					case 1:
						clear();
						resultTextView.setText("Result");
						input1EditText.setHint("CEL");
						input2EditText.setHint("FAR");
						
						converterButton.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								
								if(input1EditText.getText().length()>0 && input2EditText.getText().length()>0)
								{
									resultTextView.setText("Please select one");
								}
								
								else if(input1EditText.getText().length()<0 && input2EditText.getText().length()<0)
								{
									resultTextView.setText("Please Give Input");
								}
								
								else if(input1EditText.getText().length()>0)
								{
									CEL = (int) Double.parseDouble(input1EditText.getText().toString());
									FAR = (CEL*1.8)+32;
									resultTextView.setText(FAR+"farenheit");
								}
								
								else if(input2EditText.getText().length()>0)
								{
									FAR = (int) Double.parseDouble(input2EditText.getText().toString());
									CEL = (FAR-32)/1.8;
									resultTextView.setText(CEL+"celcius");
								}
								
									
							}
							
								
						});
						
						break;
						
						
					case 2:
						resultTextView.setText("Result");
						clear();
						input1EditText.setHint("INR");
						input2EditText.setHint("USD");
						
						converterButton.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								
								if(input1EditText.getText().length()>0 && input2EditText.getText().length()>0)
								{
									resultTextView.setText("Please select one");
								}
								
								else if(input1EditText.getText().length()<0 && input2EditText.getText().length()<0)
								{
									resultTextView.setText("Please Give Input");
								}
								
								else if(input1EditText.getText().length()>0)
								{
									INR = (int) Double.parseDouble(input1EditText.getText().toString());
									USD = INR/66;
									resultTextView.setText(USD+"USD");
								}
								
								else if(input2EditText.getText().length()>0)
								{
									USD = (int) Double.parseDouble(input2EditText.getText().toString());
									INR = USD*66;
									resultTextView.setText(INR+"rs");
								}
								
									
							}
							
								
						});
						
						break;
						
						
						
					case 3:
						
						resultTextView.setText("Result");
						clear();	
						input1EditText.setHint("KM");
						input2EditText.setHint("M");
						
						converterButton.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								// TODO Auto-generated method stub
								
								if(input1EditText.getText().length()>0 && input2EditText.getText().length()>0)
								{
									resultTextView.setText("Please select one");
								}
								
								else if(input1EditText.getText().length()<0 && input2EditText.getText().length()<0)
								{
									resultTextView.setText("Please Give Input");
								}
								
								else if(input1EditText.getText().length()>0)
								{
									KM = (int) Double.parseDouble(input1EditText.getText().toString());
									M = 1000*KM;
									resultTextView.setText(M+"meter");
								}
								
								else if(input2EditText.getText().length()>0)
								{
									M = (int) Double.parseDouble(input2EditText.getText().toString());
									KM = M/1000;
									resultTextView.setText(KM+"kilometer");
								}
								
									
							}
							
								
						});
						break;
						
						
						
				}
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        clearButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input1EditText.setText("");
				input2EditText.setText("");
				resultTextView.setText("Result");
		
				
			}
		});
        
       
        
    }
    
    public void clear()
    {
    	input1EditText.setText("");
    	input2EditText.setText("");
    }
    
    
}
