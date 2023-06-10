package com.example.myselfapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 NIM : 10120906
 NAMA : Sansan Fajrian
 KELAS : IF10K
 */

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    SharedPreferences onBoardingScreen;

    @SuppressLint("ApplySharedPref")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        onBoardingScreen = getSharedPreferences("onBoardingScreen", MODE_PRIVATE);
        boolean isFirst = onBoardingScreen.getBoolean("firstTime", true);
        if (isFirst) {
            SharedPreferences.Editor editor = onBoardingScreen.edit();
            editor.putBoolean("firstTime", false);
            editor.commit();

            OnBoardingScreen();
        } else {
            mainActivity();
        }
    }

    private void OnBoardingScreen() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, OnboardingActivity.class);
                startActivity(intent);
            }
        }, 2800);
    }

    private void mainActivity() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        }, 2800);
    }
}