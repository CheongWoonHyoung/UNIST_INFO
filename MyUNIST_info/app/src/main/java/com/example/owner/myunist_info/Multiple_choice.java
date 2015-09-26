package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 정현짱월드 on 2015-09-24.
 */
public class Multiple_choice extends Activity{
        Context mcontext;

        Button btn_selector1;
        Button btn_selector2;
        Button btn_selector3;
        Button btn_selector4;
        TextView  tv_question;
        TextView  tv_q_number;
        Drawable back;
        int flag = 0;
        int engineering = 0;
        int designer = 0;
        int management = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.multiple);
            mcontext=this;
            findAllView();


        }

        void findAllView(){
            btn_selector1 = (Button)findViewById(R.id.btn_selector1);
            btn_selector2 = (Button)findViewById(R.id.btn_selector2);
            btn_selector3 = (Button)findViewById(R.id.btn_selector3);
            btn_selector4 = (Button)findViewById(R.id.btn_selector4);
            tv_q_number = (TextView)findViewById(R.id.tv_q_number);
            tv_question = (TextView)findViewById(R.id.tv_question);
            btn_selector1.setText(R.string.A1_1);
            btn_selector2.setText(R.string.A1_2);
            btn_selector3.setText(R.string.A1_3);
            btn_selector4.setText(R.string.A1_4);
            tv_question.setText(R.string.Q1);
            tv_q_number.setText("1/9");
            btn_selector1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag++;
                    selected(1);
                }
            });
            btn_selector2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag++;
                    selected(2);

                }
            });

            btn_selector3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag++;
                    selected(3);

                }
            });

            btn_selector4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    flag++;
                    selected(4);

                }
            });
        }
/*
        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.btn_selector1:
                    flag++;
                    selected(1);
                    break;
                case R.id.btn_selector2:
                    flag++;
                    selected(2);
                    break;
                case R.id.btn_selector3:
                    flag++;
                    selected(3);
                    break;
                case R.id.btn_selector4:
                    flag++;
                    selected(4);
                    break;

            }
        }
*/
        void selected (int answer_number) {
            if(flag < 4) {
                switch (answer_number) {
                    case 1:
                        engineering += 4;
                        break;
                    case 2:
                        engineering += 3;
                        break;
                    case 3:
                        engineering += 2;
                        break;
                    case 4:
                        engineering += 1;
                        break;

                }

            } else if(flag <7){
                switch (answer_number) {
                    case 1:
                        management += 4;
                        break;
                    case 2:
                        management += 3;
                        break;
                    case 3:
                        management += 2;
                        break;
                    case 4:
                        management += 1;
                        break;

                }

            } else if (flag<10) {
                switch (answer_number) {
                    case 1:
                        designer+= 4;
                        break;
                    case 2:
                        designer += 3;
                        break;
                    case 3:
                        designer += 2;
                        break;
                    case 4:
                        designer += 1;
                        break;

                }

            }
            switch (flag) {
                case 1:
                    btn_selector1.setText(R.string.A2_1);
                    btn_selector2.setText(R.string.A2_2);
                    btn_selector3.setText(R.string.A2_3);
                    btn_selector4.setText(R.string.A2_4);
                    tv_question.setText(R.string.Q2);
                    tv_q_number.setText("2/9");
                    break;
                case 2:
                    btn_selector1.setText(R.string.A3_1);
                    btn_selector2.setText(R.string.A3_2);
                    btn_selector3.setText(R.string.A3_3);
                    btn_selector4.setText(R.string.A3_4);
                    tv_question.setText(R.string.Q3);
                    tv_q_number.setText("3/9");
                    break;
                case 3:
                    btn_selector1.setText(R.string.A4_1);
                    btn_selector2.setText(R.string.A4_2);
                    btn_selector3.setText(R.string.A4_3);
                    btn_selector4.setText(R.string.A4_4);
                    tv_question.setText(R.string.Q4);
                    tv_q_number.setText("4/9");
                    break;
                case 4:
                    btn_selector1.setText(R.string.A5_1);
                    btn_selector2.setText(R.string.A5_2);
                    btn_selector3.setText(R.string.A5_3);
                    btn_selector4.setText(R.string.A5_4);
                    tv_question.setText(R.string.Q5);
                    tv_q_number.setText("5/9");
                    break;
                case 5:
                    btn_selector1.setText(R.string.A6_1);
                    btn_selector2.setText(R.string.A6_2);
                    btn_selector3.setText(R.string.A6_3);
                    btn_selector4.setText(R.string.A6_4);
                    tv_question.setText(R.string.Q6);
                    tv_q_number.setText("6/9");
                    break;
                case 6:
                    btn_selector1.setText(R.string.A7_1);
                    btn_selector2.setText(R.string.A7_2);
                    btn_selector3.setText(R.string.A7_3);
                    btn_selector4.setText(R.string.A7_4);
                    tv_question.setText(R.string.Q7);
                    tv_q_number.setText("7/9");
                    break;
                case 7:
                    btn_selector1.setText(R.string.A8_1);
                    btn_selector2.setText(R.string.A8_2);
                    btn_selector3.setText(R.string.A8_3);
                    btn_selector4.setText(R.string.A8_4);
                    tv_question.setText(R.string.Q8);
                    tv_q_number.setText("8/9");
                    break;
                case 8:
                    btn_selector1.setText(R.string.A9_1);
                    btn_selector2.setText(R.string.A9_2);
                    btn_selector3.setText(R.string.A9_3);
                    btn_selector4.setText(R.string.A9_4);
                    tv_question.setText(R.string.Q9);
                    tv_q_number.setText("9/9");
                    break;
            }
            if (flag == 9) {
                Intent intent = new Intent(mcontext, Step1Status.class);
                intent.putExtra("engineering",engineering );
                intent.putExtra("designer",designer);
                intent.putExtra("management",management);
                startActivityForResult(intent, 1);
            }

        }
}
