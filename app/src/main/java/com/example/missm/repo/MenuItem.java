package com.example.missm.repo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

public class MenuItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item);
        setTitle(""); //removes the title "Android Repository" from this activity
    }

    //override the onCreateOption
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate new menu, get new menu id and pass in current menu
        getMenuInflater().inflate(R.menu.menuitems, menu);
        //return super.onCreateOptionsMenu(menu);  //delete this row
        return true;
    }

    //over ride the options
    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_menu_add:
                Toast.makeText(MenuItem.this, "ADD", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_menu_remove:
                Toast.makeText(MenuItem.this, "REMOVE", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
