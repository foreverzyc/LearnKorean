package com.zyc.nevergiveup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextInputLayout passwordWrapper = (TextInputLayout) findViewById(R.id.passwordWrapper);
        passwordWrapper.setHint("Password");
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String password = passwordWrapper.getEditText().getText().toString();
                if (password.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder bulid = new AlertDialog.Builder(MainActivity.this);
                    bulid.setTitle("密码错误");
                    bulid.setMessage("密码并不是"+password+"\n请重新输入");
                    bulid.setPositiveButton("好吧", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    bulid.setNegativeButton("不！让我进去", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "好吧", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    bulid.show();
                }

            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder bulid2 = new AlertDialog.Builder(MainActivity.this);
                bulid2.setTitle("获取密码");
                bulid2.setMessage("密码是：123456");
                bulid2.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid2.setNegativeButton("我不相信", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "试一下吧", Toast.LENGTH_LONG).show();

                    }
                });
                bulid2.show();
            }

        });

    }
}

