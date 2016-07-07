package com.example.lachezarivanov.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    protected String[] urls_for_category = new String[65];

    public void setUrls_for_category(String urls_for_category, int pos) {
        this.urls_for_category[pos] = urls_for_category;
    }

    public String getUrls_for_category(int pos) {
        return urls_for_category[pos];
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 0);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 1);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 2);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 3);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 4);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 5);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 6);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 7);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 8);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 9);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 10);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 11);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 12);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 13);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 14);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 15);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 16);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 17);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 18);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 19);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 20);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 21);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 22);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 23);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 24);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 25);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 26);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 27);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 28);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 29);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 30);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 31);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 32);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 33);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 34);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 35);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 36);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 37);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 38);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 39);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 40);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 41);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 42);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 43);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 44);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 45);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 46);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 47);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 48);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 49);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 50);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 51);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 52);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 53);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 54);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 55);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 56);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 57);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 58);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 59);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 60);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 61);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 62);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 63);
        setUrls_for_category("http://www.pravatami.bg/category/is/avtorsko-pravo", 64);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
            sendMessage(getUrls_for_category(position - 1));
              /*  Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show(); */
            }
        });
    }


    public void sendMessage(String url_for_category) {
        Intent intent = new Intent(this, ListViewActivity.class);
        intent.putExtra("url_for_category", url_for_category);
        startActivity(intent);
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

