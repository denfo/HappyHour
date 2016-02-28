package com;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class contactReceiver extends BroadcastReceiver {
    public contactReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Contacts Updated", Toast.LENGTH_SHORT);
    }
}
