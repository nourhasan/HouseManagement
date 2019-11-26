package dev.nour.hm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        progressBar = findViewById(R.id.splashScreenProgressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                runProgressBar();
                goToMainContent();
                finish();
            }
        });

        thread.start();
    }

    private void runProgressBar() {
        for (int i = 20; i <= 100; i += 20){
            try {
                Thread.sleep(500);
                progressBar.setProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void goToMainContent() {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
