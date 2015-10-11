package com.bob.pract2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	EditText Username,Password;
	Button Login,Cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Username = (EditText) findViewById(R.id.editTextusername);
        Password = (EditText) findViewById(R.id.editTextpassword);
        
        Login = (Button) findViewById(R.id.buttonlogin);
        Cancel = (Button) findViewById(R.id.buttoncancel);
        
        Login.setOnClickListener(this);
        Cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Username.setText("");
				Password.setText("");
				
			}
		});
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(Username.getText().toString().equalsIgnoreCase("admin") && Password.getText().toString().equals("pass"))
		{
			Toast.makeText(this, "Login successfull", Toast.LENGTH_SHORT).show();
		}
		
		else
		{
			Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
		}
		
	}
    
}
