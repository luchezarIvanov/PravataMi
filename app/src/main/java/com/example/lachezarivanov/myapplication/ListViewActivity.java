package com.example.lachezarivanov.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Xml;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    Intent intent = null;
    String url_for_parse = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        intent = getIntent();
        url_for_parse = intent.getExtras().getString("url_for_category");
        InputStream input = null;
        try {
            input = new URL(url_for_parse).openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FeedParser fp = new FeedParser();
        List itemsarr = new ArrayList();
        try {
            itemsarr = fp.ParseTheFeed(input);
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new ImageAdapter2(this));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                SendToWebView();
               Toast.makeText(ListViewActivity.this, url_for_parse,
                        Toast.LENGTH_SHORT).show();
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

    public void SendToWebView() {
        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }

}


