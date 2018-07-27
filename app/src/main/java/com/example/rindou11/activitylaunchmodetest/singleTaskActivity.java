package com.example.rindou11.activitylaunchmodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class singleTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletask);

        Button singletaskButton=(Button)findViewById(R.id.button_singletask_launch_mode);
        singletaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent singletaskIntent=new Intent(singleTaskActivity.this,singleTaskActivity2.class);
                startActivity(singletaskIntent);
            }
        });
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(singleTaskActivity.this,"I'm Back.",Toast.LENGTH_SHORT).show();
        Log.d("SingleTask Mode","on Restart");
    }
}
