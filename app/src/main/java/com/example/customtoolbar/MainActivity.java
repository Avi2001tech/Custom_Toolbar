package com.example.customtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        // setActionBar(toolbar); for normal or old toolbar

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("\uD835\uDD0D\uD835\uDD25\uD835\uDD1E\uD835\uDD31\uD835\uDD2D\uD835\uDD1E\uD835\uDD31 \uD835\uDD14\uD835\uDD32\uD835\uDD26\uD835\uDD37");
          //getSupportActionBar().setTitle("\uDD75\uD835\uDD8D\uD835D835\uDD86\uD835\uDD99\uD835\uDD95\uD835\uDD86\uD835\uDD99 \uD835\uDD7C\uD835\uDD9A\uD835\uDD8E\uD835\uDD9F");// for back button enabled
        }


       // toolbar.setTitle("Jhatpat Quiz");
       // toolbar.setSubtitle("no action");

    }
}