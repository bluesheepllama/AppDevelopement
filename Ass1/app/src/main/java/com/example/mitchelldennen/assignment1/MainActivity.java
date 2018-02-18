package com.example.mitchelldennen.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    private EditText eT;
    private Button startButton;
    private String name = "";
    private static final String KEY_INDEX = "index";
    private int mCurrentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }
            startButton = (Button) findViewById(R.id.startButton);
            startButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //saves name and passes it to the next activity
                    //next activity
                    eT = (EditText)  findViewById(R.id.nameText);
                    name = eT.getText().toString();
                    Intent intent = new Intent(getBaseContext(), Main2Activity.class);//getBaseContext()
                    intent.putExtra("NAME_TEXT", name);
                    //startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    startActivity(intent);
                    //Toast.makeText(this, "This is my Toast message!",Toast.LENGTH_SHORT).show();
                }
            });

        }


    }


