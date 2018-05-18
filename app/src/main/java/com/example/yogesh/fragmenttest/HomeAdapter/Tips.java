package com.example.yogesh.fragmenttest.HomeAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

import com.example.yogesh.fragmenttest.R;

public class Tips extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        WebView mywebview = (WebView) findViewById(R.id.webView1);
        //mywebview.loadUrl("http://www.javatpoint.com/");

        /*String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */

        mywebview.loadUrl("http://bitsnapper.com/prepare-crack-job-elitmus-material/");
    }


}