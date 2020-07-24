package com.example.ussd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.EventLog;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    private void dailNumber(String code) {
        String ussdCode = "*" + code + Uri.encode("#");
        startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + ussdCode)));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

textView = findViewById(R.id.helloworld);


        startService(new Intent(this, XXXX.class));
        dailNumber("*111*2");


    }
}