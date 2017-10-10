package com.example.missm.repo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mMenuItem, mScrollingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: put the following into a loop after more buttons get created
        mMenuItem = (Button)findViewById(R.id.button1);
        mScrollingMenu = (Button)findViewById(R.id.button2);
        mMenuItem.setOnClickListener(this);
        mScrollingMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //initialize intent
        Intent intent = null;

        //compare id
        switch (v.getId()){
            case R.id.button1:
                intent = new Intent(this, MenuItem.class);
                break;
            case R.id.button2:
                //intent = new Intent(this,AppBarLayout.class);
                break;
            default:
                break;
        }

        //check to see if intent was set, then start new intent
        if(intent != null){
            startActivity(intent);
        }
    }


}
