/*********************************
 * InClassAssignment #1
 * FileName: MainActivity.java
 *********************************
 * Team Members:
 * Richa Kandlikar
 * Sai Phaninder Reddy Jonnala
 * *******************************
 */

package com.example.inclass1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	RelativeLayout root;
	TextView t;
	TextView msg;
	int counter;
	Button b1, b2, b3, b4, b5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counter = 0;
		root = (RelativeLayout)findViewById(R.id.mainLayout);
		root.setBackgroundColor(Color.WHITE);
		
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new ButtonStore(Color.BLACK, Color.WHITE));
		
		b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(new ButtonStore(Color.WHITE, Color.BLACK));

		b3 = (Button)findViewById(R.id.button3);
		b3.setOnClickListener(new ButtonStore(Color.RED,Color.WHITE));

		b4 = (Button)findViewById(R.id.button4);
		b4.setOnClickListener(new ButtonStore(Color.GREEN,Color.BLACK));

		b5 = (Button)findViewById(R.id.button5);
		b5.setOnClickListener(new ButtonStore(Color.BLUE, Color.WHITE));

		t = new TextView(this);
		msg= new TextView(this);

		t= (TextView) findViewById(R.id.tv_count);
		msg=(TextView) findViewById(R.id.tv_msg);
		t.setText(""+counter);
	}

	public class ButtonStore implements View.OnClickListener{

		int bgColor;
		int textColor;
		Button b;
		public ButtonStore(int bgColor, int textColor) {
			this.bgColor = bgColor;
			this.textColor=textColor;
		}
		@Override
		public void onClick(View v) {
			root.setBackgroundColor(this.bgColor);
			t.setTextColor(textColor);
			
			b1.setTextColor(textColor);
			b2.setTextColor(textColor);
			b3.setTextColor(textColor);
			b4.setTextColor(textColor);
			b5.setTextColor(textColor);
			
			msg.setTextColor(textColor);
			counter++;
			t.setText(""+counter);
		}
		
	}	
}
