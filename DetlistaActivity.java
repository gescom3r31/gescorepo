package com.ubica.ubik;

/*import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;*/

import android.os.Bundle;

import java.util.ArrayList;

import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DetlistaActivity extends Activity {

    // Array of strings...
    //ListView simpleList;
    String[] countryList = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detlista);
		
		final ListView simpleList = (ListView) findViewById(R.id.simpleListView);
		final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < countryList.length; ++i) {
            list.add(countryList[i]);
            //Toast.makeText(getApplicationContext(), countryList[i],Toast.LENGTH_SHORT).show();
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        //Toast.makeText(getApplicationContext(), countryList[1],Toast.LENGTH_SHORT).show();
        simpleList.setAdapter(adapter);
        Toast.makeText(getApplicationContext(), countryList[4],Toast.LENGTH_SHORT).show();
        /*simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_detlista, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);	*/	
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detlista, menu);
		return true;
	}*/

	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}
