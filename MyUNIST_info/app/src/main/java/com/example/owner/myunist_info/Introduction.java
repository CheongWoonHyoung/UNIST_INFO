package com.example.owner.myunist_info;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Introduction extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

//        TextView dept_Name = (TextView) findViewById(R.id.dept);
        Intent intent = getIntent();

        //학과 고유 ID
        int dept_id  = intent.getIntExtra("DEPT",0);


        //학과소개 기본 레이아웃
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        ImageView img3 = (ImageView) findViewById(R.id.image3);
        TextView txt1 = (TextView) findViewById(R.id.text1);
        TextView txt2 = (TextView) findViewById(R.id.text2);
        TextView txt3 = (TextView) findViewById(R.id.text3);

        //학과 분류 레이아웃별로 학과소개를 넣는 switch 구문 ( (그림+글)X3 )
       switch(dept_id){
            case 1:
//                dept_Name.setText("EE");
                break;
            case 2:
//                dept_Name.setText("CSE");
                break;
            case 3:
//                dept_Name.setText("ECE");
                break;
            case 4:
//                dept_Name.setText("PHYSICS");
                break;
            case 5:
//                dept_Name.setText("MATH");
                break;
            case 6:
//                dept_Name.setText("MECHANIC");
                break;
            case 7:
//                dept_Name.setText("URBAN");
                break;
            case 8:
//                dept_Name.setText("BUSINESS");
                break;
            case 9:
//                dept_Name.setText("LIFE");
                break;
            case 10:
//                dept_Name.setText("MATERIAL");
                break;
            case 11:
//                dept_Name.setText("DESIGN");
                break;
            case 12:
//                dept_Name.setText("CEMISTRY");
                break;
            default:
                break;
        }




    }

}
