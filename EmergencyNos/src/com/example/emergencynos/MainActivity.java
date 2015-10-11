package com.example.emergencynos;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView numberListView;
	String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    

    final String[] numbers = {"Police","Fire","Ambulance","Anti Extortion","Police HQ","Emergency Disaster Management","Women in Distress","Crime Against Women","Specialized hospitals","Emergency medical service in local area"};
    numberListView = (ListView) findViewById(R.id.listViewnumbers);
    
    final Bundle b = new Bundle();
    b.putString(numbers[0], "100");
    b.putString(numbers[1], "101");
    b.putString(numbers[2], "102");
    b.putString(numbers[3], "1097");
    b.putString(numbers[4], "1090");
    b.putString(numbers[5], "108");
    b.putString(numbers[6], "181");
    b.putString(numbers[7], "1096");
    b.putString(numbers[8],"105911" );
    b.putString(numbers[9],"1056");
    
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, numbers);
    numberListView.setAdapter(adapter);
    
 
    
    numberListView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
				long arg3) {
			// TODO Auto-generated method stub
			
			switch(pos)
			{
			case 0:
				s=b.getString(numbers[0]);
				call(s);
				break;
				
				case 1:
					s=b.getString(numbers[1]);
					call(s);
					break;
					
				case 2:
					s=b.getString(numbers[2]);
					call(s);
					break;
					
				case 3:
					s=b.getString(numbers[3]);
					call(s);
					break;
					
				case 4:
					s=b.getString(numbers[4]);
					call(s);
					break;
					
				case 5:
					s=b.getString(numbers[5]);
					call(s);
					break;
					
				case 6:
					s=b.getString(numbers[6]);
					call(s);
					break;
					
				case 7:
					s=b.getString(numbers[7]);
					call(s);
					break;
					
				case 8:
					s=b.getString(numbers[8]);
					call(s);
					break;
					
				case 9:
					s=b.getString(numbers[9]);
					call(s);
					break;
			}
			
		}
    });

	
     
}
 public void call(String value)
 {
 	Intent intent = new Intent(Intent.ACTION_CALL);
 	intent.setData(Uri.parse("tel:"+value));
 	startActivity(intent);
 }
    
}
