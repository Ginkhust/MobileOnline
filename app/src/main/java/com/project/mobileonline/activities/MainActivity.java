package com.project.mobileonline.activities;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.project.mobileonline.R;
import com.project.mobileonline.models.DrawerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ListView drawerMenu;
    ArrayList<DrawerItem> items = new ArrayList<>();

    String[] titles = {"Store", "Categories", "History", "News", "About Us", "Exit"};
    int[] iconRes = {
            R.drawable.ic_store_black_48dp,
            R.drawable.ic_list_black_48dp,
            R.drawable.ic_history_black_48dp,
            R.drawable.ic_library_books_black_48dp,
            R.drawable.ic_info_black_48dp,
            R.drawable.ic_exit_to_app_black_48dp,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        for (int i = 0; i < titles.length; i++) {
            DrawerItem item = new DrawerItem(iconRes[i], titles[i]);
            items.add(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
