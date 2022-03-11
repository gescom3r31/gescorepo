package com.ubica.ubik;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends Activity {

   // Array of strings...
   String[] mobileArray = {"K123JK","M435MJ","K764KJ","T098HG"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);

	    ArrayAdapter adapter = new ArrayAdapter<String>(this, 
	    	         R.layout.activity_lista, mobileArray);
	    	      
	    ListView listView = (ListView) findViewById(R.id.listView1);
	    listView.setAdapter(adapter);
	    	      
	}
	
}
