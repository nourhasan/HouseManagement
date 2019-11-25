package dev.nour.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Toast.makeText(MainActivity.this, "Thanks for using HM", Toast.LENGTH_SHORT).show();
    }

    public void createHm_click(View v){
        Intent intent = new Intent(MainActivity.this, CreateHmActivity.class);
        startActivity(intent);
    }

    public void getHm_click(View v){
        Intent intent = new Intent(MainActivity.this, GetHmActivity.class);
        startActivity(intent);
    }

    public void logoutMenu_click(MenuItem item){
        Toast.makeText(MainActivity.this, "Logout", Toast.LENGTH_SHORT).show();
    }

    public void exitMenu_click(MenuItem item){
        finish();
    }
}
