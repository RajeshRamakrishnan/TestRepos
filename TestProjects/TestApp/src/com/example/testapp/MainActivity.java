package com.example.testapp;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainlayout);
		
		Button onClick = (Button)findViewById(R.id.bClick);

		
		onClick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				EditText displayText = (EditText)findViewById(R.id.etDisplay);
				displayText.setText("Welcome to the world of Dragonoid..!!");
				
				Editable styleText = displayText.getText();
				
				// checking the RB click and change the font style accordingly.
				
				RadioGroup rgStyle = (RadioGroup) findViewById(R.id.rgStyle);
				/*RadioButton rbBold = (RadioButton)findViewById(R.id.rbBold);
				RadioButton rbNormal = (RadioButton)findViewById(R.id.rbNormal);
				RadioButton rbItalic = (RadioButton)findViewById(R.id.rbItalic);*/
				
				int selected = rgStyle.getCheckedRadioButtonId();
				//RadioButton bSelected = (RadioButton)findViewById(selected);
				
				switch (selected){
				case R.id.rbBold:
					displayText.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
					break;
				case R.id.rbItalic:
					displayText.setTypeface(Typeface.DEFAULT, Typeface.ITALIC);
					break;
				case R.id.rbNormal:
					displayText.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
					break;
				
				}
				
				
				
			
			}
	
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
