package com.chanapps.four.data;

import android.content.Context;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: arley
 * Date: 11/13/12
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ToastRunnable implements Runnable {
    Context ctx;
    String text;

    public ToastRunnable(Context ctx, String text) {
        this.ctx = ctx;
        this.text = text;
    }

    @Override
    public void run(){
         Toast.makeText(ctx, text, Toast.LENGTH_SHORT).show();
    }
}

