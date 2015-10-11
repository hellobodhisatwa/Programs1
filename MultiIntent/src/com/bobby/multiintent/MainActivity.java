package com.bobby.multiintent;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private static final Intent data = null;
	private static final int resultCode = 0;
	private static final int requestCode = 0;
	Button callButton,browseButton,clickButton;
	ImageView capturedImageView;
	private int Camera=1313;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        callButton = (Button) findViewById(R.id.buttoncall);
        browseButton = (Button) findViewById(R.id.buttonbrowse);
        clickButton = (Button) findViewById(R.id.buttonclick);
        capturedImageView = (ImageView) findViewById(R.id.capturedimage);
        
        callButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+"9876543210"));
				startActivity(intent);
				
			}
		});
        
        browseButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.google.com"));
				startActivity(intent);
			}
		});
        
        clickButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, Camera);
				
			}
		});
   
    }
    
    
}
