package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView textviewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onCreate executing");
        Toast.makeText(MainActivity.this, "onCreate()", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onstart executing");
        Toast.makeText(MainActivity.this, "onStart()", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onResume executing");
        Toast.makeText(MainActivity.this, "onResume()", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onPause executing");
        Toast.makeText(MainActivity.this, "onPause()", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onStop executing");
        Toast.makeText(MainActivity.this, "onStop()", Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	textviewHello = (TextView) findViewById(R.id.textViewhello);
        textviewHello.setText("onDestroy executing");
        Toast.makeText(MainActivity.this, "onDestroy()", Toast.LENGTH_SHORT).show();
    }
    
    
}
