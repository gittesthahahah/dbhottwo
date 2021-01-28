package com.ruida.dbhottwo.db;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ruida.dbhottwo.R;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView mSecTv = findViewById(R.id.mSecTv);
        mSecTv.setText("bbbbbbbbbbbb");
    }
}
