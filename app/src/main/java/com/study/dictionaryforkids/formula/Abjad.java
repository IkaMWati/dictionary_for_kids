package com.study.dictionaryforkids.formula;

import com.study.dictionaryforkids.R;

import java.util.Random;

public class Abjad {
    private int listhuruf[] = {
            R.drawable.abjad_a_pupup,
            R.drawable.abjad_b_pupup,
            R.drawable.abjad_c_pupup,
            R.drawable.abjad_d_pupup,
            R.drawable.abjad_e_pupup,
            R.drawable.abjad_f_pupup,
            R.drawable.abjad_g_pupup,
            R.drawable.abjad_h_pupup,
            R.drawable.abjad_i_pupup,
            R.drawable.abjad_j_pupup,
            R.drawable.abjad_k_pupup,
            R.drawable.abjad_l_pupup,
            R.drawable.abjad_m_pupup,
            R.drawable.abjad_n_pupup,
            R.drawable.abjad_o_pupup,
            R.drawable.abjad_p_pupup,
            R.drawable.abjad_q_pupup,
            R.drawable.abjad_r_pupup,
            R.drawable.abjad_s_pupup,
            R.drawable.abjad_t_pupup,
            R.drawable.abjad_u_pupup,
            R.drawable.abjad_v_pupup,
            R.drawable.abjad_w_pupup,
            R.drawable.abjad_x_pupup,
            R.drawable.abjad_y_pupup,
            R.drawable.abjad_z_pupup,
    };

    private int listhuruf2[] = {
            R.drawable.abjad_a,
            R.drawable.abjad_b,
            R.drawable.abjad_c,
            R.drawable.abjad_d,
            R.drawable.abjad_e,
            R.drawable.abjad_f,
            R.drawable.abjad_g,
            R.drawable.abjad_h,
            R.drawable.abjad_i,
            R.drawable.abjad_j,
            R.drawable.abjad_k,
            R.drawable.abjad_l,
            R.drawable.abjad_m,
            R.drawable.abjad_n,
            R.drawable.abjad_o,
            R.drawable.abjad_p,
            R.drawable.abjad_q,
            R.drawable.abjad_r,
            R.drawable.abjad_s,
            R.drawable.abjad_t,
            R.drawable.abjad_u,
            R.drawable.abjad_v,
            R.drawable.abjad_w,
            R.drawable.abjad_x,
            R.drawable.abjad_y,
            R.drawable.abjad_z
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
