package com.study.dictionaryforkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.study.dictionaryforkids.study.AbjadActivity;
import com.study.dictionaryforkids.study.AngkaActivity;
import com.study.dictionaryforkids.study.AnimalsActivity;
import com.study.dictionaryforkids.study.BuahActivity;
import com.study.dictionaryforkids.study.KendaraanActivity;

public class StudyActivity extends AppCompatActivity {

    ImageButton btnAngka, btnAbjad, btnHewan, btnKendaraan, btnBuah;
    MediaPlayer button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        initView();
        initListener();
    }

    public void initView(){
        btnAbjad = findViewById(R.id.btn_abjad);
        btnAngka = findViewById(R.id.btn_angka);
        btnHewan = findViewById(R.id.btn_hewan);
        btnKendaraan = findViewById(R.id.btn_kendaraan);
        btnBuah = findViewById(R.id.btn_buah);

        button = MediaPlayer.create(getBaseContext(), R.raw.button);

        ImageButton back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void initListener(){
        btnAbjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, AbjadActivity.class);
                startActivity(intent);
                button.start();
            }
        });

        btnAngka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, AngkaActivity.class);
                startActivity(intent);
                button.start();
            }
        });

        btnHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, AnimalsActivity.class);
                startActivity(intent);
                button.start();
            }
        });

        btnKendaraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, KendaraanActivity.class);
                startActivity(intent);
                button.start();
            }
        });

        btnBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, BuahActivity.class);
                startActivity(intent);
                button.start();
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
