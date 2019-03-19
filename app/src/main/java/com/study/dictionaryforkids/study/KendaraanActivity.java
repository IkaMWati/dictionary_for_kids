package com.study.dictionaryforkids.study;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.study.dictionaryforkids.R;

public class KendaraanActivity extends AppCompatActivity {

    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendaraan);
        TampilGambar = (ImageView)findViewById(R.id.tampil_hijaiyah);
        show = (ImageButton)findViewById(R.id.abjad_a);
        hide = (ImageButton)findViewById(R.id.abjad_b);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final MediaPlayer a = MediaPlayer.create(this, R.raw.bus); //Memanggil nama lagu
        final MediaPlayer b = MediaPlayer.create(this, R.raw.feri);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.kereta);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.motor);
        final MediaPlayer e = MediaPlayer.create(this, R.raw.pesawat);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.sepeda);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.truk);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.abjad_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.abjad_b);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.abjad_c);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.abjad_d);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.abjad_e);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.abjad_f);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.abjad_g);


        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_a_popup);
                TampilGambar.startAnimation(animScale);
                a.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_b_popup);
                TampilGambar.startAnimation(animScale);
                b.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_c_popup);
                TampilGambar.startAnimation(animScale);
                c.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_d_popup);
                TampilGambar.startAnimation(animScale);
                d.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_e_popup);
                TampilGambar.startAnimation(animScale);
                e.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_f_popup);
                TampilGambar.startAnimation(animScale);
                f.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kendaraan_g_popup);
                TampilGambar.startAnimation(animScale);
                g.start();
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
