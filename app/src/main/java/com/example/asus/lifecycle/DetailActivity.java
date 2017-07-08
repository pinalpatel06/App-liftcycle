package com.example.asus.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tejas Sherdiwala on 7/3/2017.
 * &copy; Knoxpo
 */

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mBtn = (Button) findViewById(R.id.btn_add1);
        mBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SubDetailActivity.class);
        startActivity(intent);
    }
}
