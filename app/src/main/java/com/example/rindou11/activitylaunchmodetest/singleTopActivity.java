package com.example.rindou11.activitylaunchmodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleTopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singtop);

        Button singleTopButton=(Button)findViewById(R.id.button_singletop_launch_mode);
        singleTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singletopIntent=new Intent(singleTopActivity.this,singleTopActivity.class);
                startActivity(singletopIntent);
            }
        });

        Log.d("SingleTop Mode",this.toString());
    }
}
