package com.fall2013termproject.onehandedsolitaire;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class CardDrawActivity extends Activity implements OnClickListener {

	Intent newgame = getIntent();
	
	// UI components
	private Button drawButton;
	private ImageView cardImage;
	
	// Random object
	private final static Random random = new Random();
	
	// The card deck
	private final static int[] cardDeck = new int[] {	R.drawable.clubsa,	// Ace through King of clubs, spades, hearts and diamonds
														R.drawable.clubs2,	
														R.drawable.clubs3,	
														R.drawable.clubs4,	
														R.drawable.clubs5,	
														R.drawable.clubs6,
														R.drawable.clubs7,
														R.drawable.clubs8,
														R.drawable.clubs9,
														R.drawable.clubs10,
														R.drawable.clubsj,	
														R.drawable.clubsq,	
														R.drawable.clubsk,
														R.drawable.spadesa,
														R.drawable.spades2,
														R.drawable.spades3,
														R.drawable.spades4,
														R.drawable.spades5,
														R.drawable.spades6,
														R.drawable.spades7,
														R.drawable.spades8,
														R.drawable.spades9,
														R.drawable.spades10,
														R.drawable.spadesj,
														R.drawable.spadesq,
														R.drawable.spadesk,
														R.drawable.heartsa,
														R.drawable.hearts2,
														R.drawable.hearts3,
														R.drawable.hearts4,
														R.drawable.hearts5,
														R.drawable.hearts6,
														R.drawable.hearts7,
														R.drawable.hearts8,
														R.drawable.hearts9,
														R.drawable.hearts10,
														R.drawable.heartsj,
														R.drawable.heartsq,
														R.drawable.heartsk,
														R.drawable.diamondsa,
														R.drawable.diamonds2,
														R.drawable.diamonds3,
														R.drawable.diamonds4,
														R.drawable.diamonds5,
														R.drawable.diamonds6,
														R.drawable.diamonds7,
														R.drawable.diamonds8,
														R.drawable.diamonds9,
														R.drawable.diamonds10,
														R.drawable.diamondsj,
														R.drawable.diamondsq,
														R.drawable.diamondsk};	
	
	private int cardsuit1;
	private int cardrank1;
	private int cardsuit2;
	private int cardrank2;
	private int cardsuit3;
	private int cardrank3;
	private int cardsuit4;
	private int cardrank4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_card_draw);
		
		drawButton 	= (Button)findViewById(R.id.drawButton);
		cardImage	= (ImageView)findViewById(R.id.cardImage);
		
		drawButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		drawCard();
	}

	private void drawCard() {
		// Set the image resource to the one being taken randomly from the cardDeck resources table.
		cardImage.setImageResource(cardDeck[random.nextInt(cardDeck.length)]);
		
		
	}
	
}
