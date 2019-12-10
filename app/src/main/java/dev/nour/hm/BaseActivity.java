package dev.nour.hm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import dev.nour.hm.DAO.MyRoomDatabase;
import dev.nour.hm.Entities.Expense;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //database connection
        //MyRoomDatabase db = Room.databaseBuilder(getApplicationContext(), MyRoomDatabase.class, "hm_database").build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Thanks for using HM", Toast.LENGTH_SHORT).show();
    }

    public void logoutMenu_click(MenuItem item){
        Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
    }

    public void exitMenu_click(MenuItem item){
        System.exit(0);
    }
}
