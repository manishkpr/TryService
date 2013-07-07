package com.example.tryservice;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

@SuppressLint("NewApi")
public class MyService extends Service{
	public MyService() {
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.d("RAJATH", "Service Reached");
		ClipboardManager cb = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);		
		cb.addPrimaryClipChangedListener(new PrimaryClipChangedListener());
		return 0;
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO: Return the communication channel to the service.
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
