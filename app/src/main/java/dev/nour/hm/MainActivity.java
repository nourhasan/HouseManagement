package dev.nour.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createHm_click(View v){
        Intent intent = new Intent(MainActivity.this, CreateHmActivity.class);
        startActivity(intent);
    }

    public void getHm_click(View v){
        Intent intent = new Intent(MainActivity.this, GetHmActivity.class);
        startActivity(intent);
    }
}
