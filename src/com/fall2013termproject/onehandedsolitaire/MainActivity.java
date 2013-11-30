//This is an Android application for One Handed Solitaire. 

package com.fall2013termproject.onehandedsolitaire;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	//** Called when the user clicks the New Game Button */
   public void newGame(View view) {
	    //Create an intent to do something
		Intent newgame = new Intent(this, CardDrawActivity.class);
	    startActivity(newgame); 
	} 

   // Called when the user clicks the Help Button
   public void viewHelp (View view){
	    //Create an intent to do something
		Intent help = new Intent(this, ViewHelpActivity.class);
	    startActivity(help); 	  
   }
}
