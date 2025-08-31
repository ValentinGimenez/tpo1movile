package com.example.tpo1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isOn = intent.getBooleanExtra("state",false);
        if (isOn) {
            Toast.makeText(context, "AIRPLANE MODE ON", Toast.LENGTH_LONG).show();
            Uri uri = Uri.parse("tel:2664553747");
            Intent intentTel = new Intent(Intent.ACTION_DIAL, uri);
            intentTel.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intentTel);
        }else  Toast.makeText(context, "AIRPLANE MODE OFF", Toast.LENGTH_LONG).show();

    }
}