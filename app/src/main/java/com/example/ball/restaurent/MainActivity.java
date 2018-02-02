package com.example.ball.restaurent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creates listview
        createListView();

    }//Main Method

    private void createListView() {
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strName = objMyData.name();
        String[] strDetail = objMyData.detail();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strName, strDetail);
        ListView myListView = (ListView) findViewById(R.id.listView1);
        myListView.setAdapter(objMyAdapter);
        //Active when click listview
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                myIntenToDetail(i);
            }
        });
    }//creates listview

    private void myIntenToDetail(int intClick) {
        Intent objIntent = new Intent(MainActivity.this, ShowDetailActivity.class);
        objIntent.putExtra("click", intClick);
        startActivity(objIntent);

    }

    public void clickAboutMe(View view) {
        Intent objintent = new Intent(Intent.ACTION_VIEW);
        objintent.setData(Uri.parse("https://www.facebook.com/Ballthawiwut"));
        startActivity(objintent);
    }// Click
    public void regis(View view) {
        Intent objintent = new Intent(MainActivity.this ,Main2Activity.class);
        startActivity(objintent);
    }// Click
    public void login(View view) {
        Intent objintent = new Intent(MainActivity.this ,Main3Activity.class);
        startActivity(objintent);
    }// Click
}
