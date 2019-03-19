package com.study.dictionaryforkids.exercise;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.study.dictionaryforkids.HasilActivity;
import com.study.dictionaryforkids.QuizActivity;
import com.study.dictionaryforkids.R;
import com.study.dictionaryforkids.formula.Abjad;
import com.study.dictionaryforkids.formula.Animals;
import com.study.dictionaryforkids.formula.Buah;

import java.util.Random;

public class QuizBuahActivity extends AppCompatActivity {

    ImageButton next_button,help;
    ImageButton pilih;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor = 0;
    Buah abjad = new Buah();
    int n = abjad.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_buah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);
        soal = (ImageView) findViewById(R.id.soal1);
        jw1 = (ImageButton) findViewById(R.id.jawabansoal1);
        jw2 = (ImageButton) findViewById(R.id.jawabansoal2);
        jw3 = (ImageButton) findViewById(R.id.jawabansoal3);
        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iscorrect((j1 == s));
            }
        });
        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iscorrect((j2 == s));
            }
        });
        jw3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                iscorrect((j3 == s));
            }
        });
        //Button Berpindah Actvity
        next_button = (ImageButton) findViewById(R.id.back);
        next_button.setOnClickListener(new View.OnClickListener() {
            /*Perpindahan ke Main Belajar apabila di klik Button belajar */
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }

        });

    }

    public void newlevel(){
        s = abjad.getrandomhuruf();
        s1 = abjad.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;
        if(i==1) {
            j1 = s;
        }
        else{
            j1 = abjad.getrandomhuruf();
        }
        if(i==2){
            j2 = s;
        }
        else{
            j2 = abjad.getrandomhuruf();
        }
        if(i==3){
            j3 = s;
        }
        else{
            j3 = abjad.getrandomhuruf();
        }
        soal.setBackgroundResource(abjad.getimagesoal(s));
        jw1.setBackgroundResource(abjad.getimagejwbn(j1));
        jw2.setBackgroundResource(abjad.getimagejwbn(j2));
        jw3.setBackgroundResource(abjad.getimagejwbn(j3));
    }

    public void iscorrect(boolean input){
        TextView tampilskor =(TextView) findViewById(R.id.skor);
        final Animation jbenar = AnimationUtils.loadAnimation(this, R.anim.anime_scale);
        final Animation jsalah = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        if (input && i <= n) {

            MediaPlayer benar;
            benar = MediaPlayer.create(getBaseContext(), R.raw.benar);
            soal.startAnimation(jbenar);
            skor+=10;
            //benar'

            benar.start(); //Starts your sound
            newlevel();
            i++;
        } else {
            MediaPlayer salah;
            skor-=5;
            salah = MediaPlayer.create(getBaseContext(), R.raw.salah);
            soal.startAnimation(jsalah);
            salah.start();
            //salah
        }
        tampilskor.setText("SKOR : " + skor);
        if(i==n){
            Intent intent = new Intent(QuizBuahActivity.this, HasilActivity.class);
            intent.putExtra("skor", tampilskor.getText().toString());
            startActivity(intent);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //preventing default implementation previous to android.os.Build.VERSION_CODES.ECLAIR
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
