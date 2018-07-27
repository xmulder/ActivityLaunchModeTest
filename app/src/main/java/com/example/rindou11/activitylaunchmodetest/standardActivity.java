package com.example.rindou11.activitylaunchmodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class standardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        Log.d("Standard Mode",this.toString());
        final Button standardButton = (Button)findViewById(R.id.button_standard_launch_mode);
        Button singletopButton=(Button)findViewById(R.id.button_into_singletop_launch_mode);
        Button singletaskButton=(Button)findViewById(R.id.button_into_singletask_launch_mode);

        standardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(standardActivity.this,"Now into Standard Launch Mode Test.",Toast.LENGTH_SHORT).show();
                Intent standardIntent=new Intent(standardActivity.this,standardActivity.class);
                startActivity(standardIntent);
            }
        });

        singletopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(standardActivity.this,"Now into SingleTop Launch Mode Test.",Toast.LENGTH_SHORT).show();
                Intent singtopIntent=new Intent(standardActivity.this,singleTopActivity.class);
                startActivity(singtopIntent);
            }
        });

        singletaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(standardActivity.this,"Now into SingleTask Launch Mode Test.",Toast.LENGTH_SHORT).show();
                Intent singletaskIntent=new Intent(standardActivity.this,singleTaskActivity.class);
                startActivity(singletaskIntent);
            }
        });

    }
}
