package com.example.tp4;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.tp4.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    CoordinatorLayout coordinatorLayout;

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "FloatingActionButton", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(item.getItemId()==R.id.item2){Snackbar.make(viewPager, "Votre compte sera prêt dans quelques jours :)", Snackbar.LENGTH_LONG).setAction("Action", null).show(); }
        if(item.getItemId()==R.id.item3){Snackbar.make(viewPager, "Les paramètres", Snackbar.LENGTH_LONG).setAction("Action", null).show();}
        if(item.getItemId()==R.id.item4){Snackbar.make(viewPager, "Voici le mode nuit", Snackbar.LENGTH_LONG).setAction("Action", null).show();}

        return super.onOptionsItemSelected(item);
    }
    public void Page1(View view){viewPager.setCurrentItem(1,true);}
    public void Page2(View view){viewPager.setCurrentItem(2,true);}
    public void Page3(View view){viewPager.setCurrentItem(3,true);}
    public void Page4(View view){viewPager.setCurrentItem(4,true);}




}