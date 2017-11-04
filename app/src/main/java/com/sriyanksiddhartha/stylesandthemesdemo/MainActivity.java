package com.sriyanksiddhartha.stylesandthemesdemo;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/** 
 * Author : Sriyank Siddhartha 
 *
 * Module 2 : Styling Views
 *  
 * 		"AFTER" demo project
 **/
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);  // Change the layout to "activity_button" to check button applied styles

		/*
		* Comment the below code :
		* 	1. First by making sure we have "setContentView(R.layout.activity_button)"
		* 	2. To check for the styles applied to Button
		*   3. To avoid NULL POINTER EXCEPTION
		* */
		TextView txvGradient = (TextView) findViewById(R.id.txvGradient);
		LinearGradient linearGradient = new LinearGradient(0, 0,
				0, txvGradient.getTextSize(), Color.GREEN, Color.RED, Shader.TileMode.MIRROR);

		txvGradient.getPaint().setShader(linearGradient);
	}
}
