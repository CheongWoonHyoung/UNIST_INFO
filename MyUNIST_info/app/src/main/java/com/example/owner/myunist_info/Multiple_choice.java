package com.example.owner.myunist_info;

import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 정현짱월드 on 2015-09-24.
 */
public class Multiple_choice extends Activity implements View.OnClickListener {


        Button btn_selector1;
        Button btn_selector2;
        Button btn_selector3;
        Button btn_selector4;
        TextView tv_question;
        TextView tv_q_number;
        int flag = 0;
        int engineering = 0;
        int designer = 0;
        int management = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            findAllView();
        }

        void findAllView(){
            btn_selector1.findViewById(R.id.btn_selector1);
            btn_selector2.findViewById(R.id.btn_selector2);
            btn_selector3.findViewById(R.id.btn_selector3);
            btn_selector4.findViewById(R.id.btn_selector4);
            tv_q_number.findViewById(R.id.tv_q_number);
            tv_question.findViewById(R.id.tv_question);

        }

        //R.sunda.
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
                        designer += 4;
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

            } else if (flag<10) {
                switch (answer_number) {
                    case 1:
                        management+= 4;
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

            }
            switch (flag) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
            if (flag == 9) {
                Intent intent = new Intent(this, Step1Status.class);
                intent.putExtra("engineering",engineering );
                intent.putExtra("designer",designer);
                intent.putExtra("management",management);
                startActivity(intent);
            }

        }


}
