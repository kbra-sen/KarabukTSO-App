package com.karabuktso.tsoaplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        textView=(TextView)findViewById(R.id.textView);
        textView=(TextView)findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==textView){
                    Intent intent=new Intent(getApplicationContext(),baskanin_mesaji.class);
                    startActivity(intent);
                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_anasayfa) {
            setTitle("Karabük TSO");
            Anasayfa fragment = new Anasayfa();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, new Anasayfa());
            fragmentTransaction.commit();

        } else if (id == R.id.nav_kurumsal) {

            setTitle("Kurumsal");
            Kurumsal fragment = new Kurumsal();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment, "Kurumsal");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_hizmetler) {
            setTitle("Hizmetler");
            Hizmetler fragment = new Hizmetler();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment, "Hizmetler");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_uyeler) {
            setTitle("Üyeler");
            Uyeler fragment = new Uyeler();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment, "Uyeler");
            fragmentTransaction.commit();
        } else if (id == R.id.nav_yayinlar) {
            setTitle("Yayınlar");
            Yayinlar fragment = new Yayinlar();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment, "Yayınlar");
            fragmentTransaction.commit();
        }else if (id == R.id.nav_disticaret) {
            setTitle("DIŞ TİCARET");
            DisTicaret fragment = new DisTicaret();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Dış Ticaret");
            fragmentTransaction.commit();

        }
        else if (id == R.id.nav_akre) {
            setTitle("AKREDİTASYON");
            Akreditasyon fragment = new Akreditasyon();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Akreditasyon");
            fragmentTransaction.commit();

        }
        else if (id == R.id.nav_online) {
            setTitle("ONLİNE EĞİTİM");
            OnlineEgitim fragment = new OnlineEgitim();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Online Eğitim");
            fragmentTransaction.commit();

        }
        else if (id == R.id.nav_fuar) {
            setTitle("FUAR TAKVİMİ");
            FuarTakvimi fragment = new FuarTakvimi();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Fuar Takvimi");
            fragmentTransaction.commit();

        }
        else if (id == R.id.nav_etkinlik) {
            setTitle("ETKİNLİK TAKVİMİ");
            EtkinlikTakvimi fragment = new EtkinlikTakvimi();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Etkinlik Takvimi");
            fragmentTransaction.commit();

        }
        else if (id == R.id.nav_bildirim) {
            setTitle("BİLDİRİM AYARLARI");
            BildirimAyarlari fragment = new BildirimAyarlari();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fram, fragment,  "Bildirim Ayarları");
            fragmentTransaction.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
