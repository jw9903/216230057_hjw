package com.example.jw9930;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by 홍지우 on 2017-12-04.
 */

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    private Button btnTEST;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.btnTEST3);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
