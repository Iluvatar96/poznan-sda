package com.example.md.adrian.masterdetail;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int dana = getIntent().getIntExtra("nazwa", 0);
    }
}
