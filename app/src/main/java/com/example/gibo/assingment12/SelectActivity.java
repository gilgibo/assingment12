package com.example.gibo.assingment12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"Reading Webpage");
        menu.add(0,2,0,"Rss");
        menu.add(0,3,0,"Server login");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == 1){
            Intent intent = new Intent(SelectActivity.this,MainActivity.class);
            startActivity(intent);
        }
        if(item.getItemId() == 2){
            Intent intent = new Intent(SelectActivity.this,Main2Activity.class);
            startActivity(intent);
        }
        if(item.getItemId() == 3){
            Intent intent = new Intent(SelectActivity.this,Main3Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
