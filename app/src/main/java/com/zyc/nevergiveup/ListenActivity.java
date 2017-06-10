package com.zyc.nevergiveup;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ListenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        start();
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish(); // back button
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void start() {
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);
        Button button10=(Button)findViewById(R.id.button10);
        Button button11=(Button)findViewById(R.id.button11);
        Button button12=(Button)findViewById(R.id.button12);
        Button button13=(Button)findViewById(R.id.button13);
        Button button14=(Button)findViewById(R.id.button14);
        Button button15=(Button)findViewById(R.id.button15);
        Button button16=(Button)findViewById(R.id.button16);
        Button button17=(Button)findViewById(R.id.button17);
        Button button18=(Button)findViewById(R.id.button18);
        Button button19=(Button)findViewById(R.id.button19);
        Button button20=(Button)findViewById(R.id.button20);
        Button button21=(Button)findViewById(R.id.button21);
        Button button22=(Button)findViewById(R.id.button22);
        Button button23=(Button)findViewById(R.id.button23);
        Button button24=(Button)findViewById(R.id.button24);
        Button button25=(Button)findViewById(R.id.button25);
        Button button26=(Button)findViewById(R.id.button26);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid1 = new AlertDialog.Builder(ListenActivity.this);
                bulid1.setTitle("记笔记时间");
                bulid1.setMessage("ㅏ：嘴自然张开，舌头接触下齿龈，但不要贴上，嘴唇不要紧张，也不要成圆形。发音与汉语拼音的“a”相似");
                bulid1.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid1.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid1.show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid2 = new AlertDialog.Builder(ListenActivity.this);
                bulid2.setTitle("记笔记时间");
                bulid2.setMessage("ㅑ：先发“ㅣ”，然后迅速滑到“ㅏ”，与汉语拼音的“ya”相似。");
                bulid2.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid2.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid2.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid3 = new AlertDialog.Builder(ListenActivity.this);
                bulid3.setTitle("记笔记时间");
                bulid3.setMessage("ㅓ：口形比“ㅏ”小一些，舌后部稍微抬起，嘴唇不要紧张，也不要成圆形。");
                bulid3.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid3.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid3.show();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid4 = new AlertDialog.Builder(ListenActivity.this);
                bulid4.setTitle("记笔记时间");
                bulid4.setMessage("ㅕ：先发“ㅣ”，然后迅速滑到“ㅓ”。");
                bulid4.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid4.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid4.show();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid5 = new AlertDialog.Builder(ListenActivity.this);
                bulid5.setTitle("记笔记时间");
                bulid5.setMessage("ㅗ：嘴稍微张开，舌后部抬起，双唇向前拢成圆形。与汉语拼音的“o”相似，但比“o”口形要小且圆。");
                bulid5.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid5.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid5.show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid6 = new AlertDialog.Builder(ListenActivity.this);
                bulid6.setTitle("记笔记时间");
                bulid6.setMessage("ㅛ：先发“ㅣ”，然后迅速滑到“ㅗ”。");
                bulid6.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid6.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid6.show();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid7 = new AlertDialog.Builder(ListenActivity.this);
                bulid7.setTitle("记笔记时间");
                bulid7.setMessage("ㅜ：口形比“ㅗ”小一些，双唇向前拢成圆形。与汉语拼音的韵母“u”相似。");
                bulid7.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid7.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid7.show();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid8 = new AlertDialog.Builder(ListenActivity.this);
                bulid8.setTitle("记笔记时间");
                bulid8.setMessage("ㅠ：先发“ㅣ”，然后迅速滑到“ㅜ”。");
                bulid8.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid8.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid8.show();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid9 = new AlertDialog.Builder(ListenActivity.this);
                bulid9.setTitle("记笔记时间");
                bulid9.setMessage("ㅡ：嘴稍微张开，舌身稍向后缩，舌前部放平，舌后部略向软腭抬起，嘴唇向两边拉开。发音为在英语音标 [w] 的基础上带有发“wu”的爆破音。");
                bulid9.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid9.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid9.show();

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder bulid10 = new AlertDialog.Builder(ListenActivity.this);
                bulid10.setTitle("记笔记时间");
                bulid10.setMessage("ㅣ：与汉语拼音的“yi”相似。");
                bulid10.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid10.setNegativeButton("假装听懂了", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                bulid10.show();

            }
        });


    }
    }


