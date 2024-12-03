package com.iamvkr.capprintpage;

import android.webkit.WebView;
import android.util.Log;
import android.content.Context;
import android.os.Build;

public class Printpage implements Runnable {

    private Context context;
    private WebView webView;

    public Printpage(WebView webView,Context context) {
        this.webView = webView;
        this.context = context;
    }

    @Override
    public void run() {
        PrintTheWebPage(this.webView);
    }

    android.print.PrintJob printJob;
	private void PrintTheWebPage(WebView webView) {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            android.print.PrintManager printManager = (android.print.PrintManager) context.getSystemService(Context.PRINT_SERVICE);
		
		    String jobName = "Docs_Pdf";
		
		    android.print.PrintDocumentAdapter printAdapter = webView.createPrintDocumentAdapter(jobName);
		
		    assert printManager != null;
		
		    printJob = printManager.print(jobName, printAdapter, new android.print.PrintAttributes.Builder().build());
        }
	}
}
