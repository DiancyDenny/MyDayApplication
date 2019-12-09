package com.example.mydayapplication.activity;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mydayapplication.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
     /*   Intent intent = getIntent();
        CURRENT_DIARY_URI = intent.getData();
        if (CURRENT_DIARY_URI == null) {
            setTitle("Add note");
            invalidateOptionsMenu();
        } else {
            setTitle("Edit note");
            getLoaderManager().initLoader(LOADER_ID, null, this);
        } */

    }
}