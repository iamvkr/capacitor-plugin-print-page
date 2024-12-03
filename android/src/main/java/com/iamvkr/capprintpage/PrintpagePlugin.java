package com.iamvkr.capprintpage;

import android.app.Activity;
import android.webkit.WebView;
import android.content.Context;
import android.os.Build;

import com.getcapacitor.Bridge;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Printpage")
public class PrintpagePlugin extends Plugin {

    @PluginMethod()
    public void print(PluginCall call) {
        try{
            Activity activity = this.getActivity();
            if (activity == null) {
                throw new Exception("Activity instance is null!");
            }

            Bridge bridge = this.getBridge();
            if (bridge == null) {
                throw new Exception("Bridge instance is null!");
            }

            WebView webview = bridge.getWebView();
            if (webview == null) {
                throw new Exception("WebView instance is null!");
            }

            activity.runOnUiThread(new Printpage(webview,activity));

            JSObject ret = new JSObject();
            ret.put("status", true);
            call.resolve(ret);

        }catch(Exception ex){
            call.reject(ex.getMessage(), ex);
        }
    }
}
