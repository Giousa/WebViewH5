package com.ut.webviewh5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private WebView mWebViewH5;
    private int[] heartbeatArray;
    private Random mRandom;

    private Timer mTimer = new Timer(1000, new Timer.OnTimer() {
        @Override
        public void onTime(Timer timer) {

            //心率模拟数据
            for (int j = 0; j < 20; j++) {
                heartbeatArray[j] = mRandom.nextInt(110)+60;
            }
            String heartString = TransformUtils.ArrayToString(heartbeatArray);
            mWebViewH5.loadUrl("javascript:show('" + heartString + "')");
            Log.d("MainActivity","heartString="+heartString);
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebViewH5 = (WebView) findViewById(R.id.webview_for_h5);

        heartbeatArray = new int[20];
        mRandom = new Random();

        WebSettings mWebViewForH5Settings = mWebViewH5.getSettings();
        mWebViewForH5Settings.setJavaScriptEnabled(true);//设置支持js调用
        String h5Url = "file:///android_asset/h5compete/index.html";
        mWebViewH5.loadUrl(h5Url);
        mTimer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTimer.stop();
    }
}
