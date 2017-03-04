package com.nadongbin.suwon_ex02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    // 메뉴를 붙이는 부분
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item0:
                Toast.makeText(this, "item0 선택", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item1:
                return true;
            case R.id.item2:
                return true;
            case R.id.item3:
                Toast.makeText(this, "item3 선택", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "default", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}


