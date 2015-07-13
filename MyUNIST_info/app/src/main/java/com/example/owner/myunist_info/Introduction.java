package com.example.owner.myunist_info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Introduction extends FragmentActivity {

    private ViewPager intro_pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

//        TextView dept_Name = (TextView) findViewById(R.id.dept);
        Intent intent = getIntent();

        //학과 고유 ID
        int dept_id  = intent.getIntExtra("DEPT", 0);

        intro_pager = (ViewPager) findViewById(R.id.intropager);


        //학과 분류 레이아웃별로 학과소개를 넣는 switch 구문 ( (그림+글)X3 )
        intro_pager.setAdapter(new Introduction_Fragment_pager_adapter(getSupportFragmentManager(),dept_id));



    }

}
