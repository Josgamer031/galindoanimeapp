package com.galindo.anime;
import android.app.*; import android.os.*; import android.content.*; import android.net.*; import android.webkit.*; import android.graphics.Color; import android.view.*;
public class MainActivity extends Activity {
 WebView web;
 @Override public void onCreate(Bundle b){ super.onCreate(b); getWindow().setStatusBarColor(Color.rgb(9,11,18)); web=new WebView(this); setContentView(web); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW); web.setWebViewClient(new WebViewClient(){ @Override public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest r){ Uri u=r.getUrl(); if("file".equals(u.getScheme())||"https".equals(u.getScheme())) return false; startActivity(new Intent(Intent.ACTION_VIEW,u)); return true; }}); web.loadUrl("file:///android_asset/index.html"); }
 @Override public void onBackPressed(){ if(web.canGoBack())web.goBack(); else super.onBackPressed(); }
}
