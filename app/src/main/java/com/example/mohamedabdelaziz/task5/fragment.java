package com.example.mohamedabdelaziz.task5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mohamed Abd ELaziz on 9/5/2017.
 */

public class fragment extends Fragment {
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false) ;
//        recyclerView= (RecyclerView) view.findViewById(R.id.recycle) ;
//        recyclerView.setAdapter(new adpater());
        return view ;
    }
}
