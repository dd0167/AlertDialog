package com.example.alertdialog;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * The type Main activity.
 *
 * @author Dean David <dd0167@bs.amalnet.k12.il>
 * @version 1.6
 * @since 13 /11/2020
 */
public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll=(LinearLayout) findViewById(R.id.ll);
    }

    /**
     * Click 1 - AlertDialog only message
     * @param view the view
     */
    public void click1(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setMessage("Hello world1");
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Click 2 - AlertDialog only message and icon
     * @param view the view
     */
    public void click2(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Dean David");
        adb.setMessage("Hello world2");
        adb.setIcon(R.drawable.logo);
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Click 3 - AlertDialog only message, icon and one button
     * @param view the view
     */
    public void click3(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Dean David");
        adb.setMessage("Hello world3");
        adb.setIcon(R.drawable.logo);
        adb.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Click 4 - AlertDialog only message, icon and two button
     * @param view the view
     */
    public void click4(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Dean David");
        adb.setMessage("Hello world4");
        adb.setIcon(R.drawable.logo);
        adb.setPositiveButton("Change Background Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int r = (int) Math.round(Math.random() * 255);
                int g = (int) Math.round(Math.random() * 255);
                int b = (int) Math.round(Math.random() * 255);
                int color=Color.argb(255,r,g,b);
                ll.setBackgroundColor(color);
            }
        });
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Click 5 - AlertDialog only message, icon and three button
     * @param view the view
     */
    public void click5(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setTitle("Dean David");
        adb.setMessage("Hello world5");
        adb.setIcon(R.drawable.logo);
        adb.setPositiveButton("Change Background Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int r = (int) Math.round(Math.random() * 255);
                int g = (int) Math.round(Math.random() * 255);
                int b = (int) Math.round(Math.random() * 255);
                int color=Color.argb(255,r,g,b);
                ll.setBackgroundColor(color);
            }
        });
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNeutralButton("Default", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad=adb.create();
        ad.show();
    }

    /**
     * Create Options menu
     * @param menu the menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Credits");
        return true;
    }

    /**
     * Click in Options menu
     * @param item the item
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if (st.equals("Credits"))
        {
            Intent in=new Intent(this,CreditsActivity.class);
            startActivity(in);
        }
        return true;
    }
}