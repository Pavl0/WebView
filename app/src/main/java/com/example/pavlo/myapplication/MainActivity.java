package com.example.pavlo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button load_button;
    private static EditText url_text;
    private static WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openUrl();
    }
    public void openUrl(){
        load_button = (Button)findViewById(R.id.button);
        url_text = (EditText)findViewById(R.id.editText);
        browser = (WebView)findViewById(R.id.webview);

        load_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        String url = url_text.getText().toString();
                        browser.getSettings().setLoadsImagesAutomatically(true);
                        browser.getSettings().setJavaScriptEnabled(true);
                        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        browser.setWebViewClient(new WebViewClient());
                        browser.loadUrl(url);
                    }

                }
        );
    }
}
