package com.zyc.nevergiveup;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private Korean[] koreans={new Korean("关于韩国",R.drawable.aboutkorea),new Korean("韩国景点",R.drawable.scenekorea),new Korean("学习韩语对英语的影响",R.drawable.englishkorea),new Korean("韩语造句",R.drawable.korea1),new Korean("韩国食物",R.drawable.koreafood),new Korean("韩国大学",R.drawable.koreanun),new Korean("韩国动漫",R.drawable.koreanani),new Korean("韩国游戏",R.drawable.gamekorean)};
    private List<Korean>koreanList=new ArrayList<>();
    private KoreanAdapter adapter;
    private long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initKorean();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new KoreanAdapter(koreanList);
        recyclerView.setAdapter(adapter);









        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "如遇到问题，请联系qq：723204821", Snackbar.LENGTH_LONG)
                        .setAction("GO!", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String url = "mqqwpa://im/chat?chat_type=wpa&uin=723204821";
                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                            }
                        }).setActionTextColor(Color.YELLOW).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    private void initKorean(){
        koreanList.clear();
        for(int i=0;i<koreans.length;i++){
            koreanList.add(koreans[i]);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(this, "暂未实装", Toast.LENGTH_SHORT).show();
            return true;
        }else if (id == R.id.action_update){
            Toast.makeText(this, "暂未实装", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.action_vote){
            Toast.makeText(this, "谢谢！我会继续努力的", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Toast.makeText(this, "暂未实装", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_gallery) {
            Intent intent=new Intent(Main2Activity.this,ListenActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Intent intent=new Intent(Main2Activity.this,FightActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Toast.makeText(this, "暂未实装", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {
            AlertDialog.Builder bulid50 = new AlertDialog.Builder(this);
            bulid50.setTitle("等等");
            bulid50.setMessage("目前应用的完成度太低，还是不要分享啦。");
            bulid50.setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            bulid50.show();

        } else if (id == R.id.nav_send) {
            AlertDialog.Builder bulid55 = new AlertDialog.Builder(this);
            bulid55.setTitle("关于");
            bulid55.setMessage("中南大学云麓谷技术部app组\n\n"+"作者\n"+"素材提供：陈帅\n"+"程序设计：张一琛\n\n\n"+"powered by AndroidStudio\n"+"powered by CSDN\n"+"powered by <<第二行代码>>\n\n"+"感谢参与测试的你！");
            bulid55.setPositiveButton("嗯...", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            bulid55.show();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - exitTime) > 2000) {
                Toast.makeText(Main2Activity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                exitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }

        }
        return true;
    }

}
