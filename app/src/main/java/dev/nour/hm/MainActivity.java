package dev.nour.hm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

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
