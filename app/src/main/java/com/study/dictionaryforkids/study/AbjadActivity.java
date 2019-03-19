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

public class AbjadActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abjad);
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

        final MediaPlayer a = MediaPlayer.create(this, R.raw.abjad_a); //Memanggil nama lagu
        final MediaPlayer b = MediaPlayer.create(this, R.raw.abjad_b);
        final MediaPlayer c = MediaPlayer.create(this, R.raw.abjad_c);
        final MediaPlayer d = MediaPlayer.create(this, R.raw.abjad_d);
        final MediaPlayer e = MediaPlayer.create(this, R.raw.abjad_e);
        final MediaPlayer f = MediaPlayer.create(this, R.raw.abjad_f);
        final MediaPlayer g = MediaPlayer.create(this, R.raw.abjad_g);
        final MediaPlayer h = MediaPlayer.create(this, R.raw.abjad_h);
        final MediaPlayer i = MediaPlayer.create(this, R.raw.abjad_i);
        final MediaPlayer j = MediaPlayer.create(this, R.raw.abjad_j);
        final MediaPlayer k = MediaPlayer.create(this, R.raw.abjad_k);
        final MediaPlayer l = MediaPlayer.create(this, R.raw.abjad_l);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.abjad_m);
        final MediaPlayer n = MediaPlayer.create(this, R.raw.abjad_n);
        final MediaPlayer o = MediaPlayer.create(this, R.raw.abjad_o);
        final MediaPlayer p = MediaPlayer.create(this, R.raw.abjad_p);
        final MediaPlayer q = MediaPlayer.create(this, R.raw.abjad_q);
        final MediaPlayer r = MediaPlayer.create(this, R.raw.abjad_r);
        final MediaPlayer s = MediaPlayer.create(this, R.raw.abjad_s);
        final MediaPlayer t = MediaPlayer.create(this, R.raw.abjad_t);
        final MediaPlayer u = MediaPlayer.create(this, R.raw.abjad_u);
        final MediaPlayer ve = MediaPlayer.create(this, R.raw.abjad_v);
        final MediaPlayer w = MediaPlayer.create(this, R.raw.abjad_w);
        final MediaPlayer x = MediaPlayer.create(this, R.raw.abjad_x);
        final MediaPlayer y = MediaPlayer.create(this, R.raw.abjad_y);
        final MediaPlayer z = MediaPlayer.create(this, R.raw.abjad_z);

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
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.abjad_q);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.abjad_r);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.abjad_s);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.abjad_t);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.abjad_u);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.abjad_v);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.abjad_w);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.abjad_x);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.abjad_y);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.abjad_z);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_a_popup);
                TampilGambar.startAnimation(animScale);
                a.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_b_popup);
                TampilGambar.startAnimation(animScale);
                b.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_c_popup);
                TampilGambar.startAnimation(animScale);
                c.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_d_popup);
                TampilGambar.startAnimation(animScale);
                d.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_e_popup);
                TampilGambar.startAnimation(animScale);
                e.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_f_popup);
                TampilGambar.startAnimation(animScale);
                f.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_g_popup);
                TampilGambar.startAnimation(animScale);
                g.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_h_popup);
                TampilGambar.startAnimation(animScale);
                h.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_i_popup);
                TampilGambar.startAnimation(animScale);
                i.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_j_popup);
                TampilGambar.startAnimation(animScale);
                j.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_k_popup);
                TampilGambar.startAnimation(animScale);
                k.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_l_popup);
                TampilGambar.startAnimation(animScale);
                l.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_m_popup);
                TampilGambar.startAnimation(animScale);
                m.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_n_popup);
                TampilGambar.startAnimation(animScale);
                n.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_o_popup);
                TampilGambar.startAnimation(animScale);
                o.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_p_popup);
                TampilGambar.startAnimation(animScale);
                p.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_q_popup);
                TampilGambar.startAnimation(animScale);
                q.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_r_popup);
                TampilGambar.startAnimation(animScale);
                r.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_s_popup);
                TampilGambar.startAnimation(animScale);
                s.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_t_popup);
                TampilGambar.startAnimation(animScale);
                t.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_u_popup);
                TampilGambar.startAnimation(animScale);
                u.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.studi_abjad_v_popup);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                ve.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_w_popup);
                TampilGambar.startAnimation(animScale);
                w.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_x_popup);
                TampilGambar.startAnimation(animScale);
                x.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_y_popup);
                TampilGambar.startAnimation(animScale);

                y.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.studi_abjad_z_popup);
                TampilGambar.startAnimation(animScale);
                z.start();
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
