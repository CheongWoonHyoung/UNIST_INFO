package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Step1Status extends Activity {
    private ProgressBar engine;
    private ProgressBar design;
    private ProgressBar manage;
    private TextView conclusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step1status);

        Intent intent = new Intent(this.getIntent());

        int engineering = intent.getIntExtra("engineering",1);
        int designer = intent.getIntExtra("designer",1);
        int management  = intent.getIntExtra("management", 1);
        conclusion = (TextView) findViewById(R.id.txt2);
        engine = (ProgressBar) findViewById(R.id.engine);
        manage = (ProgressBar) findViewById(R.id.manage);
        design = (ProgressBar) findViewById(R.id.design);
        engine.setProgress(engineering);
        design.setProgress(designer);
        manage.setProgress(management);

        if(engineering < 6 && designer < 6 && management < 6){
            conclusion.setText("더 열심히 노력하여 자신의 재능을 발굴해 보는게 어떨까요?");
        }
        else if(engineering >= 6 && designer >= 6 && management >= 6){
            conclusion.setText("당신은 과학 및 공학 분야와 경영학 분야 그리고 디자인 분야에 모두 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 다양한 학부들을 더 탐구해 보는것은 어떨까요? \n");
        }
        else if(engineering >= 6 && designer < 6 && management < 6){
            conclusion.setText("당신은 공학, 과학 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 다양한 이공계 학부들을 더 탐구해 보는것은 어떨까요?\n");
        }
        else if (designer >= 6 && engineering < 6 && management < 6){
            conclusion.setText("당신은 디자인 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 디자인 및 인간 공학부를 더 탐구해 보는것은 어떨까요?\n");
        }
        else if(management >= 6 && designer < 6 && engineering < 6){
            conclusion.setText("당신은 경영학 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 경영학부를 더 탐구해 보는것은 어떨까요?\n");
        }
        else if(engineering >= 6 && designer >= 6 && management < 6){
            conclusion.setText("당신은 과학 및 공학 분야와 디자인 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 다양한 이공계 학부들과 디자인 및 인간 공학부를 더 탐구해 보는것은 어떨까요?\n");
        }
        else if(engineering >= 6 && management >= 6 && designer < 6){
            conclusion.setText("당신은 경영학 분야와 공학 및 과학 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 경영학부와 다양한 이공계 학부들을 더 탐구해 보는것은 어떨까요?\n");
        }
        else if(management >= 6 && designer >= 6 && engineering < 6){
            conclusion.setText("당신은 공학 및 과학 분야와 디자인 분야에 재능과 소질이 있어 보입니다. UNIST INFO 어플리케이션에서 다양한 이공계 학부들과 디자인 및 인간 공학부를 더 탐구해 보는것은 어떨까요?\n");
        }

    }

}
