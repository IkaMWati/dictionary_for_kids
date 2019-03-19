package com.study.dictionaryforkids.formula;

import com.study.dictionaryforkids.R;

import java.util.Random;

public class Animals {
    private int listhuruf[] = {
            R.drawable.kuis_hewan_a_popup,
            R.drawable.kuis_hewan_b_popup,
            R.drawable.kuis_hewan_c_popup,
            R.drawable.kuis_hewan_d_popup,
            R.drawable.kuis_hewan_e_popup,
            R.drawable.kuis_hewan_f_popup,
            R.drawable.kuis_hewan_g_popup,
            R.drawable.kuis_hewan_h_popup,
            R.drawable.kuis_hewan_i_popup,
            R.drawable.kuis_hewan_j_popup,
            R.drawable.kuis_hewan_k_popup,
            R.drawable.kuis_hewan_l_popup,
            R.drawable.kuis_hewan_m_popup,
            R.drawable.kuis_hewan_n_popup,
            R.drawable.kuis_hewan_o_popup,
            R.drawable.kuis_hewan_p_popup
    };

    private int listhuruf2[] = {
            R.drawable.hewan_a,
            R.drawable.hewan_b,
            R.drawable.hewan_c,
            R.drawable.hewan_d,
            R.drawable.hewan_e,
            R.drawable.hewan_f,
            R.drawable.hewan_g,
            R.drawable.hewan_h,
            R.drawable.hewan_i,
            R.drawable.hewan_j,
            R.drawable.hewan_k,
            R.drawable.hewan_l,
            R.drawable.hewan_m,
            R.drawable.hewan_n,
            R.drawable.hewan_o,
            R.drawable.hewan_p
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
