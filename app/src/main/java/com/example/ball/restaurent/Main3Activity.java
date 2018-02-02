package com.example.ball.restaurent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        createListView();

    }//Main Method

    private void createListView() {
        MyData objMyData = new MyData();
        int[] intIcon = objMyData.icon();
        String[] strName = objMyData.name();
        String[] strDetail = objMyData.detail();

        MyAdapter objMyAdapter = new MyAdapter(Main3Activity.this, intIcon, strName, strDetail);
        ListView myListView = (ListView) findViewById(R.id.listView1);
        myListView.setAdapter(objMyAdapter);
        //Active when click listview
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                myIntenToDetail(i);
            }
        });
    } private void myIntenToDetail(int intClick) {
        Intent objIntent = new Intent(Main3Activity.this, ShowDetailActivity.class);
        objIntent.putExtra("click", intClick);
        startActivity(objIntent);

    }
}
