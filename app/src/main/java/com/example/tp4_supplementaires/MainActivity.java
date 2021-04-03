package com.example.tp4_supplementaires;

import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tp4_supplementaires.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    private Menu menu;
    public static int CurrentPosition;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
/*
        ImageView image1=findViewById(R.id.imageView1);
        ImageView image2=findViewById(R.id.imageView2);
        ImageView image3=findViewById(R.id.imageView3);
        ImageView image4=findViewById(R.id.imageView4);

*/
/*
        image1.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "The favorite list would appear on clicking this icon",
                        Toast.LENGTH_LONG).show();
            }
        });
*/
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "La messagerie est momentanément indisponible ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


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
        String s="";
//noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // Item itema=(Item) findViewById(R.id.action_settings);
            Snackbar.make(viewPager, "L'item '"+item.getTitle().toString()+"' a été selectionné", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        if (id == R.id.APropos) {
            Snackbar.make(viewPager, "L'item '"+item.getTitle().toString()+"' a été selectionné", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        if (id == R.id.Contact) {
            Snackbar.make(viewPager, "L'item '"+item.getTitle().toString()+"' a été selectionné", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        return super.onOptionsItemSelected(item);
    }


    public void showPage1(View view) {
        viewPager.setCurrentItem(1,true);
    }
    public void showPage2(View view) {
        viewPager.setCurrentItem(2,true);
    }
    public void showPage3(View view) {
        viewPager.setCurrentItem(3,true);
    }
    public void showPage4(View view) {
        viewPager.setCurrentItem(4,true);
    }



}