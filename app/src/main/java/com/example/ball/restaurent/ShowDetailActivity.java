package com.example.ball.restaurent;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import static com.example.ball.restaurent.R.id.detail;

public class ShowDetailActivity extends AppCompatActivity {

    //Explicit
    private TextView showTitleTextView;
    private ImageView showImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //Bind Widget
        bindWidget();

        //Show Widget
        showWidget();
    }//Main method

    private void showWidget() {
        //Receive Fron Inten
        int intClick = getIntent().getIntExtra("click", 0);
        //Show Title
        MyData objMyData = new MyData();
        String[] strTitle = objMyData.name();
        showTitleTextView.setText(strTitle[intClick]);
        //showImage
        int[] intImage = objMyData.icon();
        showImageView.setImageResource(intImage[intClick]);
        //showDetail



    }//Show Widget


    private void bindWidget() {
        showTitleTextView = findViewById(R.id.textView5);
        showImageView = findViewById(R.id.imageView2);

    }//bindWidget
}
