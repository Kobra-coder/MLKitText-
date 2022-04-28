package com.example.rcjoshi.mlkittext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import Guide.GuideActivity;


public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Button guide_b;
    Button mlkit_b;
    Button setting_b;
    Button about_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //**********************************************************//
        setContentView(R.layout.dashboard_activity);
        guide_b = (Button) findViewById(R.id.guide);
        guide_b.setOnClickListener(this);
        setting_b= (Button) findViewById(R.id.setting);
        setting_b.setOnClickListener(this);
        mlkit_b = (Button) findViewById(R.id.mlkit);
        mlkit_b.setOnClickListener(this);
        about_b = (Button) findViewById(R.id.about);
        about_b.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.guide:
                Intent intent = new Intent(this, GuideActivity.class);
                startActivity(intent);

                break;

            default:
                break;

        }

        switch (view.getId()) {
            case R.id.mlkit:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }
        switch (view.getId()) {
            case R.id.setting:
                Intent intent = new Intent(this,AboutActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }

        switch (view.getId()) {
            case R.id.about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }

    }
}