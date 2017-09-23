package com.example.khaled.therealbusy;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class demofragment extends Fragment implements View.OnClickListener {


    public demofragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view= inflater.inflate(R.layout.fragment_demofragment, container, false);
        view.findViewById(R.id.showOther).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        ((MainActivity)getActivity()).ShowOther();
        /*
          ((StaticFragmentsDemoActivity)getActivity()).showOther(v);
         */
    }
}
