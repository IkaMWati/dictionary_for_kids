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

public class BuahActivity extends AppCompatActivity {

    ImageView TampilGambar;
    ImageButton show,hide,help,next_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
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

        final MediaPlayer a = MediaPlayer.create(this, R.raw.apel); //Memanggil nama lagu
        final MediaPlayer b = MediaPlayer.create(this, R.raw.ceri);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.jagung);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.jambu);
        final MediaPlayer e = MediaPlayer.create(this, R.raw.jeruk);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.kelapa);
        final MediaPlayer h = MediaPlayer.create(this, R.raw.lemon);
        final MediaPlayer i = MediaPlayer.create(this, R.raw.pepaya);
        final MediaPlayer j = MediaPlayer.create(this, R.raw.nanas);
        final MediaPlayer k = MediaPlayer.create(this, R.raw.mangga);
        final MediaPlayer l = MediaPlayer.create(this, R.raw.pisang);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.alpukat);
        final MediaPlayer n = MediaPlayer.create(this, R.raw.anggur);
        final MediaPlayer o = MediaPlayer.create(this, R.raw.semangka);
        final MediaPlayer p = MediaPlayer.create(this, R.raw.stroberi);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.abjad_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.abjad_b);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.abjad_c);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.abjad_d);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.abjad_e);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.abjad_f);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.abjad_g);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.abjad_h);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.abjad_i);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.abjad_j);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.abjad_k);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.abjad_l);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.abjad_m);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.abjad_n);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.abjad_o);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.abjad_p);


        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_a_popup);
                TampilGambar.startAnimation(animScale);
                a.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_b_popup);
                TampilGambar.startAnimation(animScale);
                b.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_c_popup);
                TampilGambar.startAnimation(animScale);
                c.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_d_popup);
                TampilGambar.startAnimation(animScale);
                d.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_e_popup);
                TampilGambar.startAnimation(animScale);
                e.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_f_popup);
                TampilGambar.startAnimation(animScale);
                f.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_h_popup);
                TampilGambar.startAnimation(animScale);
                h.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_i_popup);
                TampilGambar.startAnimation(animScale);
                i.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_j_popup);
                TampilGambar.startAnimation(animScale);
                j.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_k_popup);
                TampilGambar.startAnimation(animScale);
                k.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_l_popup);
                TampilGambar.startAnimation(animScale);
                l.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_m_popup);
                TampilGambar.startAnimation(animScale);
                m.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_n_popup);
                TampilGambar.startAnimation(animScale);
                n.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_o_popup);
                TampilGambar.startAnimation(animScale);
                o.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.buah_p_popup);
                TampilGambar.startAnimation(animScale);
                p.start();
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
