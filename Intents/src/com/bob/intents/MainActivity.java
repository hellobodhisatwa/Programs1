package com.bob.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	Button Gobutton;
	EditText inputeditEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Gobutton = (Button) findViewById(R.id.buttongo);
        inputeditEditText = (EditText) findViewById(R.id.inputeditText);
        
        Gobutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				    String I1 = inputeditEditText.getText().toString();
			        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			        intent.putExtra("Key1", I1);
			        startActivity(intent);
			        
				
			}
		});
    }
    
}
