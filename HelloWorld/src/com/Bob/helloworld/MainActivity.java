package com.Bob.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button Login,cancel;
	EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Login= (Button) findViewById(R.id.loginbutton);
        cancel=(Button) findViewById(R.id.cancelbutton);
        Password = (EditText) findViewById(R.id.passwordeditText);
        Username = (EditText) findViewById(R.id.usernameeditText);
        
        Login.setOnClickListener((OnClickListener) this);
        cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Username.setText("");
				Password.setText("");
				
			}
		});
        
        
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(Username.getText().toString().equalsIgnoreCase("admin") && Password.getText().toString().equals("password"))
		{
			Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
		}
		else{
			Toast.makeText(this, "Invalid Username or password", Toast.LENGTH_SHORT).show();
		}
	}
    
}
