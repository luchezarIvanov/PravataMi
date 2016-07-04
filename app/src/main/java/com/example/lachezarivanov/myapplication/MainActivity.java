package com.example.lachezarivanov.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void editWebViewContent(WebView view){
        String removeFooterJS = "(function() { " + "var foot = document.getElementsByTagName('footer')[0];" +
                "foot.parentNode.removeChild(foot);})()";
        String removeHeaderJS = "(function() { " + "var head = document.getElementsByTagName('header')[0];" +
                "head.parentNode.removeChild(head);})()";
        //removes the Запознайте се in Екипът
        String js1 = "(function(){var classname=\"tippy_link\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //nz
        String js2 = "(function(){var classname=\"nr_inner\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //removes the Social network buttons in Екипът
        String js3 = "(function(){var classname=\"social\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //naj-weroqtno ne mi trqbwa, za6toto we4e e social?
        String js4 = "(function(){var classname=\"sociable\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //remove the post box (both box to comment and comments from other users)
        String removePostBox = "(function(){var classname=\"disqus_thread\"; var cells = document.getElementById(classname); cells.parentNode.removeChild(cells);})()";
        //remove the box from which you can go to the shop
        String removeNau4iPowe4e = "(function(){var classname=\"hp-intro\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //remove an ad
        String removeSomeAd = "(function(){var classname=\"textwidget\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //I forgot what I'm removing here
        String removeToggles = "(function(){var classname=\"accordion toggles\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //remove Spodeli from Novini screen
        String removeSpodeli = "(function(){var classname=\"share\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //remove the spodeli options, we have a toolbar for this
        String removeSpodeliNadNovina = "(function(){var classname=\"at-above-post\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";
        //edit the padding of the articles in Новини so it shows all of its content
        String editPostInfos = "(function(){var classname=\"post-headline\"; var cells = document.getElementsByClassName(classname); var i = 0; while(cells[i]){cells[i].style.padding = \"25px\";i++;}})()";
        //remove the subscriber box
        String removeSubscriberBox = "(function(){var classname=\"mc-embedded-subscribe-form\"; var cells = document.getElementById(classname); cells.parentNode.removeChild(cells);})()";
        //remove the categories in the novini screen
        String removeCategoriesBox = "(function(){var classname=\"btn light green\"; var cells = document.getElementsByClassName(classname); while(cells[0]){cells[0].parentNode.removeChild(cells[0]);}})()";

        view.loadUrl("javascript:" + removeHeaderJS);
        view.loadUrl("javascript:" + removeFooterJS);
        view.loadUrl("javascript:" + js1);
        view.loadUrl("javascript:" + js2);
        view.loadUrl("javascript:" + js3);
        view.loadUrl("javascript:" + js4);
        view.loadUrl("javascript:" + removePostBox);
        view.loadUrl("javascript:" + removeNau4iPowe4e);
        view.loadUrl("javascript:" + removeSomeAd);
        view.loadUrl("javascript:" + removeToggles);
        view.loadUrl("javascript:" + removeSpodeli);
        view.loadUrl("javascript:" + removeSpodeliNadNovina);
        view.loadUrl("javascript:" + editPostInfos);
        view.loadUrl("javascript:" + removeSubscriberBox);
        view.loadUrl("javascript:" + removeCategoriesBox);
    }
}
/*class ParsePage extends AsyncTask<String, Void, String>
{
    protected String DoInBackground(String... arg0) {
        Document doc;
        try {
            doc = jsoup.connect("http://www.pravatami.bg").get();
        } catch  (IOException e){
            e.printStackTrace();
        }

        return "Executed"
    }
    protected void onPostExecuted(String result){

    }
    protected void onPreExecuted(String res) {

    }
}

    public void (View v){
        startActivity(new Intent(MainActivity.this, SiteActivity.class));
    }
    */