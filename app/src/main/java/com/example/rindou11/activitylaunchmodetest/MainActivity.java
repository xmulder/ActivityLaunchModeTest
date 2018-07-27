package com.example.rindou11.activitylaunchmodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Standard Mode",this.toString());
        Button standardButton = (Button)findViewById(R.id.button_standard_launch_mode);
        Button singletopButton=(Button)findViewById(R.id.button_into_singletop_launch_mode);

        standardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent standardIntent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(standardIntent);
            }
        });

        singletopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singtopIntent=new Intent(MainActivity.this,singleTopActivity.class);
                startActivity(singtopIntent);
            }
        });

    }
}
