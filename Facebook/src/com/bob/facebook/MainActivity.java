package com.bob.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	Button Login;
	EditText Username,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Login = (Button) findViewById(R.id.loginbutton);
        Username = (EditText) findViewById(R.id.usernameeditText);
        Password = (EditText) findViewById(R.id.passwordeditText);
        
        Login.setOnClickListener(this);
        
        
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(Username.getText().toString().equalsIgnoreCase("admin") && Password.getText().toString().equals("password"))
		{
			String I1 = Username.getText().toString();
			Intent intent = new Intent(MainActivity.this,Homepage.class);
			intent.putExtra("Key1", I1);
			startActivity(intent);
		}
		else{
			Toast.makeText(this, "Invalid Username or password", Toast.LENGTH_SHORT).show();
		}
		
	}
    
}
