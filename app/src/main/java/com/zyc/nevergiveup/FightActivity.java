package com.zyc.nevergiveup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView4);
        imageView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(FightActivity.this, "暂未实装", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView5);
        imageView22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(FightActivity.this, "暂未实装", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView33 = (ImageView) findViewById(R.id.imageView6);
        imageView33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(FightActivity.this, "暂未实装", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView imageView44 = (ImageView) findViewById(R.id.imageView7);
        imageView44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(FightActivity.this, "暂未实装", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish(); // back button
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
