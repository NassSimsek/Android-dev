package com.example.restoranhesap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splashThread;
        splashThread = new Thread() {
            @Override  public void run() {
                try{
                    synchronized (this){
                        wait(3000);
                    }

                }catch (InterruptedException ex){

                }finally {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();// tekrar geri dönüş olmasın diye
                }
            }
        };
        splashThread.start();
    }
}