package com.randeep.myapp.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSpotify, btnScoreApp, btnLibApp, btnBuildItBig, btnXyzReader, btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotify = (Button) findViewById(R.id.button1);
        btnScoreApp = (Button) findViewById(R.id.button2);
        btnLibApp = (Button) findViewById(R.id.button3);
        btnBuildItBig = (Button) findViewById(R.id.button4);
        btnXyzReader = (Button) findViewById(R.id.button5);
        btnCapstone = (Button) findViewById(R.id.button6);

        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.sportify));
            }
        });

        btnScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.football));
            }
        });

        btnLibApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.lib_app));
            }
        });

        btnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.reader));
            }
        });

        btnBuildItBig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.gradle));
            }
        });

        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateToast(getResources().getString(R.string.capstone));
            }
        });

    }

    private void generateToast(String msg){
        Toast.makeText(getApplicationContext(), getResources().getString(R.string.msg)+" "+msg,Toast.LENGTH_SHORT).show();
    }
}
