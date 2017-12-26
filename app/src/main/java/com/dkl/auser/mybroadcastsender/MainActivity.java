package com.dkl.auser.mybroadcastsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void onClick (){
        Intent it = new Intent("demo.com.intent.action.CUSTOM_BROADCAST");
        sendBroadcast(it);

    }

}
