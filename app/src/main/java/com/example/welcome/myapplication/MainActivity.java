package com.example.welcome.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends Activity {
    //private PowerManager powerManager;
    //private PowerManager.WakeLock wakeLock;
    //private int field = 0x00000020;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doScreenOff(View view) {
        // This event fires on button press. Here we just setting screen brightness into zero.
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.screenBrightness = 0;
        getWindow().setAttributes(params);
    }

    @Override
    public void onResume() {
        // This event fires when activity resumes. Here we setting the screen brightness back to full.
        super.onResume();  // Always call the superclass method first
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.screenBrightness = 1;
        getWindow().setAttributes(params);
    }
}
