package com.dredged.darksuntreausregen;

import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainInterface extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        int screenOrientation = getResources().getConfiguration().orientation;

        if(screenOrientation == Configuration.ORIENTATION_PORTRAIT) {

            hideSidePanel();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_interface, menu);
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

    private void hideSidePanel() {

        View sidePane = findViewById(R.id.side_panel);
        if(sidePane.getVisibility() == View.VISIBLE) {

            sidePane.setVisibility(View.GONE);

        }

    }

    public void onMinorRollClick(View view) {
    }

    public void onMediumRollClick(View view) {
    }

    public void onMajorRollClick(View view) {
    }
}
