package com.scut.itpm.umo.core.announce;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scut.itpm.umo.R;

/**
 * Created by DELL on 2016/11/2.
 */

public class AnnounceFragment extends Fragment {

    public static AnnounceFragment newInstance(){
        return new AnnounceFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_announce,null);
        return view;
    }

    @Override
    public void onResume() {
        Log.e("AnnounceFragment:","onResume");
        super.onResume();
    }
}