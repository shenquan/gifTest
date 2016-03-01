package com.example.test;

import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

//	private GifImageView gifImageView;
	private WebView runWebWiew =null;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		gifImageView = (GifImageView) findViewById(R.id.ag);
		
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<HTML>"
				+ "<body bgcolor='#f3f3f3'>"
				+ "<div align=center>"
				+ "<IMG src='file:///android_asset/bird.gif'"
				+ "width='100%' />"
				+ "</div>"
				+ "</body>"
				+ "</html>");
		runWebWiew = (WebView)findViewById(R.id.runWebView);
		runWebWiew.loadDataWithBaseURL(null, strBuilder.toString(), "text/html", "UTF-8", null);
		
	}

}
