package com.fall2013termproject.onehandedsolitaire;

import java.util.Random;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class CardDrawActivity extends Activity implements OnClickListener {

	Intent newgame = getIntent();
	
	// UI components
	private Button guessHigher;
	private Button guessLower;
	private ImageView cardImage;
	private PopupWindow message;
	
	
	
	// Random object
	private final static Random random = new Random();
	
	// The card deck
	private final static int[] cardDeck = new int[] {	R.drawable.clubs2, // 2 through Ace of clubs, spades, hearts and diamonds
														R.drawable.spades2,
														R.drawable.hearts2,
														R.drawable.diamonds2,
														R.drawable.clubs3,
														R.drawable.spades3,
														R.drawable.hearts3,
														R.drawable.diamonds3,
														R.drawable.clubs4,
														R.drawable.spades4,
														R.drawable.hearts4,
														R.drawable.diamonds4,
														R.drawable.clubs5,	
														R.drawable.spades5,
														R.drawable.hearts5,
														R.drawable.diamonds5,
														R.drawable.clubs6,
														R.drawable.spades6,
														R.drawable.hearts6,
														R.drawable.diamonds6,
														R.drawable.clubs7,
														R.drawable.spades7,
														R.drawable.hearts7,
														R.drawable.diamonds7,
														R.drawable.clubs8,
														R.drawable.spades8,
														R.drawable.hearts8,
														R.drawable.diamonds8,
														R.drawable.clubs9,
														R.drawable.spades9,
														R.drawable.hearts9,
														R.drawable.diamonds9,
														R.drawable.clubs10,
														R.drawable.spades10,
														R.drawable.hearts10,
														R.drawable.diamonds10,
														R.drawable.clubsj,
														R.drawable.spadesj,
														R.drawable.heartsj,
														R.drawable.diamondsj,
														R.drawable.clubsq,
														R.drawable.spadesq,
														R.drawable.heartsq,
														R.drawable.diamondsq,
														R.drawable.clubsk,
														R.drawable.spadesk,
														R.drawable.heartsk,
														R.drawable.diamondsk,
														R.drawable.clubsa,
														R.drawable.spadesa,
														R.drawable.heartsa,
														R.drawable.diamondsa};	
	
	//variable to set the card value
	public int cardValue = -1;
	public int previousCardValue = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_card_draw);
		
	    guessHigher = (Button)findViewById(R.id.guessHigher);
		guessLower	= (Button)findViewById(R.id.guessLower);
		cardImage	= (ImageView)findViewById(R.id.cardImage);
		
		guessHigher.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v){ 
			   drawCard();
			   compareHighValue(cardValue, previousCardValue);
			}
		});

		guessLower.setOnClickListener(this);
		//drawButton.setOnClickListener(this);	
	} //end onCreate

	@Override
	public void onClick(View w) {
         drawCard();
	} //end onClick

	private int drawCard() {
		// Set the image resource to the one being taken randomly from the cardDeck resources table.
		cardImage.setImageResource(cardDeck[random.nextInt(cardDeck.length)]);
		// if this is NOT the first card drawn, set the current card value to the previous card value before
		// resetting current card value
        if (cardValue != -1){
        	previousCardValue = cardValue;
        }
		cardValue = cardDeck[random.nextInt(cardDeck.length)];
	    String size = Integer.toString(cardDeck.length);
		Context context = getApplicationContext();
		CharSequence text = size;
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		return cardValue;
	} //end drawCard
	
	private void compareHighValue(int cardValue, int previousCardValue){
	   // If this is not the first draw, compare current card value with previous card value
		
		Context context = getApplicationContext();
		CharSequence text = previousCardValue + " " + cardValue;
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	 
	} //end CompareHighValue
	
	
	
	
} //end of CardDrawActivity


