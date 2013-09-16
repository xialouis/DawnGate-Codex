package com.xyals.dawngatecodex;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
    // Handle button clicks on home screen
    public void homeButtonClicked(View view) {
    	// Open the appropriate screen depending on button clicked
    	switch(view.getId()) {
    	case(R.id.shapersButton):
    		break;
    	
    	case(R.id.itemsButton):
    		break;
    	
    	case(R.id.minimapButton):
    		break;
    	
    	case(R.id.buildsButton):
    		break;
    	
    	default:
    		break;
    	}
    }
    
}
