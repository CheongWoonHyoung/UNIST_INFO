package com.example.owner.myunist_info;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.TextView;

//Main
public class LecPage_Popup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lec_explanation);
        Intent getInfo = getIntent();
        int code = getInfo.getIntExtra("get_code", 0);
        TextView explanation = (TextView) findViewById(R.id.explanation);

        switch(code){
            case 1:explanation.setText(R.string.dhe_1);break;
            case 2:explanation.setText(R.string.dhe_2);break;
            case 3:explanation.setText(R.string.dhe_3);break;
            case 4:explanation.setText(R.string.dhe_4);break;
            case 5:explanation.setText(R.string.dhe_5);break;
            case 6:explanation.setText(R.string.dhe_6);break;
            case 7:explanation.setText(R.string.dhe_7);break;
            case 8:explanation.setText(R.string.dhe_8);break;
            case 9:explanation.setText(R.string.eche_1);break;
            case 10:explanation.setText(R.string.eche_2);break;
            case 11:explanation.setText(R.string.eche_3);break;
            case 12:explanation.setText(R.string.eche_4);break;
            case 13:explanation.setText(R.string.eche_5);break;
            case 14:explanation.setText(R.string.eche_6);break;
            case 15:explanation.setText(R.string.eche_7);break;
            case 16:explanation.setText(R.string.eche_8);break;
            case 17:explanation.setText(R.string.eche_9);break;
            case 18:explanation.setText(R.string.eche_10);break;
            case 19:explanation.setText(R.string.eche_11);break;
            case 20:explanation.setText(R.string.eche_12);break;
            case 21:break;
            case 22:break;
            case 23:break;
            case 24:break;
            case 25:break;
            case 26:break;
            case 27:break;
            case 28:break;
            case 29:break;
            case 30:break;
            case 31:break;
            case 32:break;
            case 33:break;
            case 34:break;
            case 35:break;
            case 36:break;
            case 37:explanation.setText(R.string.mne_1);break;
            case 38:explanation.setText(R.string.mne_2);break;
            case 39:explanation.setText(R.string.mne_3);break;
            case 40:explanation.setText(R.string.mne_4);break;
            case 41:explanation.setText(R.string.mne_5);break;
            case 42:explanation.setText(R.string.mne_6);break;
            case 43:explanation.setText(R.string.mne_7);break;
            case 44:break;
            case 45:explanation.setText(R.string.mse_1);break;
            case 46:explanation.setText(R.string.mse_2);break;
            case 47:explanation.setText(R.string.mse_3);break;
            case 48:explanation.setText(R.string.mse_4);break;
            case 49:explanation.setText(R.string.mse_5);break;
            case 50:explanation.setText(R.string.mse_6);break;
            case 51:explanation.setText(R.string.mse_7);break;
            case 52:explanation.setText(R.string.mse_8);break;
            case 53:explanation.setText(R.string.mse_9);break;
            case 54:explanation.setText(R.string.mse_10);break;
            case 55:explanation.setText(R.string.ba_1);break;
            case 56:explanation.setText(R.string.ba_2);break;
            case 57:explanation.setText(R.string.ba_3);break;
            case 58:explanation.setText(R.string.ba_4);break;
            case 59:explanation.setText(R.string.ba_5);break;
            case 60:explanation.setText(R.string.ba_6);break;
            case 61:explanation.setText(R.string.ba_7);break;
            case 62:break;
            case 63:explanation.setText(R.string.ba_9);break;
            case 64:explanation.setText(R.string.ba_10);break;
            case 65:explanation.setText(R.string.ba_11);break;
            case 66:explanation.setText(R.string.ba_12);break;
            case 67:break;
            case 68:break;
            case 69:break;
            case 70:break;
            case 71:break;
            case 72:break;
            case 73:break;
            case 74:break;
            case 75:break;
            case 76:break;
            case 77:break;
            case 78:break;
            case 79:break;
            case 80:explanation.setText(R.string.uee_1);break;
            case 81:explanation.setText(R.string.uee_2);break;
            case 82:explanation.setText(R.string.uee_3);break;
            case 83:explanation.setText(R.string.uee_4);break;
            case 84:explanation.setText(R.string.uee_5);break;
            case 85:explanation.setText(R.string.uee_6);break;
            case 86:explanation.setText(R.string.uee_7);break;
            case 87:explanation.setText(R.string.uee_8);break;
            case 88:explanation.setText(R.string.uee_9);break;
            case 89:explanation.setText(R.string.uee_10);break;
            case 90:explanation.setText(R.string.uee_11);break;

        }


    }


}