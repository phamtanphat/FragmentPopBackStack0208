package com.ptp.phamtanphat.fragmentpopbackstack0208;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KhoaPhamPC on 6/11/2017.
 */

public class Fragment_B extends Fragment {

    View view;
    TextView txtfragmentb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b,container,false);
        txtfragmentb = view.findViewById(R.id.textviewfragmentb);
        return view;
    }
}
