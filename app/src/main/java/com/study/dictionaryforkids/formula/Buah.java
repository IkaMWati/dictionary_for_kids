package com.study.dictionaryforkids.formula;

import com.study.dictionaryforkids.R;

import java.util.Random;

public class Buah {
    private int listhuruf[] = {
            R.drawable.kuis_buah_a_popup,
            R.drawable.kuis_buah_b_popup,
            R.drawable.kuis_buah_c_popup,
            R.drawable.kuis_buah_d_popup,
            R.drawable.kuis_buah_e_popup,
            R.drawable.kuis_buah_f_popup,
            R.drawable.kuis_buah_g_popup,
            R.drawable.kuis_buah_h_popup,
            R.drawable.kuis_buah_i_popup,
            R.drawable.kuis_buah_j_popup,
            R.drawable.kuis_buah_k_popup,
            R.drawable.kuis_buah_l_popup,
            R.drawable.kuis_buah_m_popup,
            R.drawable.kuis_buah_n_popup,
            R.drawable.kuis_buah_o_popup,
            R.drawable.kuis_buah_p_popup
    };

    private int listhuruf2[] = {
            R.drawable.buah_a,
            R.drawable.buah_b,
            R.drawable.buah_c,
            R.drawable.buah_d,
            R.drawable.buah_e,
            R.drawable.buah_f,
            R.drawable.buah_g,
            R.drawable.buah_h,
            R.drawable.buah_i,
            R.drawable.buah_j,
            R.drawable.buah_k,
            R.drawable.buah_l,
            R.drawable.buah_m,
            R.drawable.buah_n,
            R.drawable.buah_o,
            R.drawable.buah_p
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
