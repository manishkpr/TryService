package com.example.tryservice;

import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import android.util.Log;

public class PrimaryClipChangedListener implements OnPrimaryClipChangedListener {

	@Override
	public void onPrimaryClipChanged() {
		// TODO Auto-generated method stub				
		Log.d("RAJATH", "copyclip reached");					
	}

}
