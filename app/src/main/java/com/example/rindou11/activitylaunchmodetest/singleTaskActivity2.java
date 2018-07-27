package com.example.rindou11.activitylaunchmodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class singleTaskActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task2);

        Button singletaskButton2=(Button)findViewById(R.id.button_singletask_launch_mode_2);
        singletaskButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singletaskIntent2=new Intent(singleTaskActivity2.this,singleTaskActivity.class);
                startActivity(singletaskIntent2);
            }
        });
    }

    protected void onDestroy(){
        Toast.makeText(singleTaskActivity2.this,"singleTask Activity 2 was OnDestroy.",Toast.LENGTH_SHORT).show();
        super.onDestroy();
        Log.d("SingleTask Acitvity 2","on Destory");
    }
}
