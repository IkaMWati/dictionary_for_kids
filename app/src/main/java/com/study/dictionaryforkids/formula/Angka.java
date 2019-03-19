package com.study.dictionaryforkids.formula;

import com.study.dictionaryforkids.R;

import java.util.Random;

public class Angka {
    private int listhuruf[] = {
            R.drawable.angka_a_popup,
            R.drawable.angka_b_popup,
            R.drawable.angka_c_popup,
            R.drawable.angka_d_popup,
            R.drawable.angka_e_popup,
            R.drawable.angka_f_popup,
            R.drawable.angka_g_popup,
            R.drawable.angka_h_popup,
            R.drawable.angka_i_popup,
            R.drawable.angka_j_popup,
            R.drawable.angka_k_popup,
            R.drawable.angka_l_popup,
            R.drawable.angka_m_popup,
            R.drawable.angka_n_popup,
            R.drawable.angka_o_popup,

    };

    private int listhuruf2[] = {
            R.drawable.angka_a,
            R.drawable.angka_b,
            R.drawable.angka_c,
            R.drawable.angka_d,
            R.drawable.angka_e,
            R.drawable.angka_f,
            R.drawable.angka_g,
            R.drawable.angka_h,
            R.drawable.angka_i,
            R.drawable.angka_j,
            R.drawable.angka_k,
            R.drawable.angka_l,
            R.drawable.angka_m,
            R.drawable.angka_n,
            R.drawable.angka_o,

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
