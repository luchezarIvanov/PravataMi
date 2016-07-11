package com.example.lachezarivanov.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

public class ListViewActivity extends AppCompatActivity {

    Intent intent = null;
    String url_for_parse = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        intent = getIntent();
        url_for_parse = intent.getExtras().getString("url_for_category");
        final InputStream input = null;

        class ParseXML extends AsyncTask<InputStream, Void, List> {


            @Override
            protected List doInBackground(InputStream... input) {
                try
                {
                    input[0] = new URL(url_for_parse).openStream();
                }
                catch(
                        IOException e
                )

                {
                    e.printStackTrace();
                }

                FeedParser fp = new FeedParser();
                List itemsarr = new ArrayList();
                try
                {
                    itemsarr = fp.ParseTheFeed(input[0]);
                } catch (XmlPullParserException | IOException e)
                {
                    e.printStackTrace();

                }
                return itemsarr;
            }

            @Override
            protected void onPostExecute(List list) {
                super.onPostExecute(list);
                //interface.prawin
            }
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new ImageAdapter2(this));

        //new Task(new Listener) , Listener = interface class onDataFinished(String s)
        //ListViewActivity implements Listener
        //String format: new JsonObject(s)
        //JsonObject.getJsonArray(klu4)
        //for (JsonObject : jsonarray) -> title, link -> new Item (title, link)
        //list.add(item)
        //ListView.addAdapter(List<Items> ->

        final List finalItemsarr = (List) new ParseXML().execute(input);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                FeedParser.Item url_item = (FeedParser.Item) finalItemsarr.get(position - 1);
                String url_for_webview = url_item.link;
                SendToWebView(url_for_webview);
              /* Toast.makeText(ListViewActivity.this, url_for_parse,
                        Toast.LENGTH_SHORT).show(); */
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void SendToWebView(String url_for_webview) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url_for_webview", url_for_webview);
        startActivity(intent);
    }

}


