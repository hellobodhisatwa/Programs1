package com.bobby.camera;

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
	
	Button cameraButton;
	ImageView capturedImageView;
	int CAMERA = 1313;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cameraButton = (Button) findViewById(R.id.buttoncamera);
        capturedImageView= (ImageView) findViewById(R.id.imageViewcaptured);
        
        cameraButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				
				startActivityForResult(intent, CAMERA);
				
			}
		});
        
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	if(requestCode==CAMERA)
    	{
    		if(resultCode==RESULT_OK)
    		{
    			Bitmap bm = (Bitmap) data.getExtras().get("data");
    			capturedImageView.setImageBitmap(bm);
    		}
    		
    		else if(resultCode==RESULT_CANCELED)
    		{
    			Toast.makeText(MainActivity.this, "Error in camera", Toast.LENGTH_SHORT).show();
    		}
    	}
    }
    
}
