package com.example.ball.restaurent;


/**
 * Created by ICE89 on 19/1/2561.
 */

public class MyData {
    public String[] name() {
        String[] strName = new String[5];
        strName[0] = "ข้าวผัด";
        strName[1] = "ข้าวผัดกะเพรา";
        strName[2] = "ข้าวผัดพริกแกง";
        strName[3] = "ข้าวทอดกะเทียม";
        strName[4] = "ผัดไทย";

        return strName;
    }

    public String[] detail() {
        String[] strDetail = new String[5];
        strDetail[0] = "ข้าวผัด";
        strDetail[1] = "ข้าวผัดกะเพรา";
        strDetail[2] = "ข้าวผัดพริกแกง";
        strDetail[3] = "ข้าวทอดกะเทียม";
        strDetail[4] = "ผัดไทย";

        return strDetail;
    }
    public int[] icon() {

        int[] intIcon = new int[]{R.drawable.riecpad, R.drawable.riecpadka, R.drawable.riecpadpinkang, R.drawable.todkatam, R.drawable.padthai};

        return intIcon;
    }

}//Main Class

