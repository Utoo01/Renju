package com.utoo.ljt.renju;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.utoo.ljt.renju.view.MyBoard;

public class MainActivity extends AppCompatActivity {

    private MyBoard mBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBoard = (MyBoard) findViewById(R.id.wuziqi);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
            mBoard.start();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
