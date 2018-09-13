package com.example.academy_intern.stric_code.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.academy_intern.stric_code.R;
import com.example.academy_intern.stric_code.implementation.DataSource;

public class fragmentDisplay extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        return (view  = inflater.inflate(R.layout.display, container, false));

    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView txtDisplay = (TextView)view.findViewById(R.id.txtDisplay);


        DataSource dataSource = new DataSource();
        String output = dataSource.display();
        txtDisplay.setText(output);
    }
}
