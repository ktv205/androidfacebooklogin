package com.example.krishnateja.facebooklogin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by krishnateja on 2/25/2015.
 */
public class SelectionFragment extends Fragment {
    private static final String TAG = "SelectionFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_selection,
                container, false);
        return view;
    }
}
