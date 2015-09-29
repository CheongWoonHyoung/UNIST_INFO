package com.example.owner.myunist_info;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 정현짱월드 on 2015-09-24.
 */
public class Multiple_choice_Intro extends Activity {
    @Override
    protected void onCreate(Bundle saveInstancedState){
        super.onCreate(saveInstancedState);

        setContentView(R.layout.multiple_intro);
        final Context mcontext = this;

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(mcontext,Multiple_choice.class);
                        startActivity(i);
                        finish();
            }
        });
    }
}
