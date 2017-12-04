package com.example.jw9930;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 홍지우 on 2017-12-04.
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";


    private WebView WebView01;
    private Button btnTEST;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState) {

        View view = inflater.inflate(R.layout.tab2_fragment,container,false);
        WebView01 = (WebView)view.findViewById(R.id.webView01);
        WebView01.setWebViewClient(new WebViewClient());
        WebSettings webSettings = WebView01.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView01.loadUrl("http://www.google.com");
        btnTEST = (Button) view.findViewById(R.id.btnTEST2);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 2",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
