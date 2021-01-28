package com.ruida.dbhottwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTv = findViewById(R.id.mTv);
        mTv.setText("aaaaaaaaaaaaaaaaaa");
    }
}
