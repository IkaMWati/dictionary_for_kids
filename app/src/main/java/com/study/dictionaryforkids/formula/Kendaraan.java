package com.study.dictionaryforkids.formula;

import com.study.dictionaryforkids.R;

import java.util.Random;

public class Kendaraan {
    private int listhuruf[] = {
            R.drawable.kuis_kendaraan_a_popup,
            R.drawable.kuis_kendaraan_b_popup,
            R.drawable.kuis_kendaraan_c_popup,
            R.drawable.kuis_kendaraan_d_popup,
            R.drawable.kuis_kendaraan_e_popup,
            R.drawable.kuis_kendaraan_f_popup,
            R.drawable.kuis_kendaraan_g_popup
    };

    private int listhuruf2[] = {
            R.drawable.kedaraan_a,
            R.drawable.kedaraan_b,
            R.drawable.kedaraan_c,
            R.drawable.kedaraan_d,
            R.drawable.kedaraan_e,
            R.drawable.kedaraan_f,
            R.drawable.kedaraan_g
    };

    public int[] getlist(){
        return listhuruf;

    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}
