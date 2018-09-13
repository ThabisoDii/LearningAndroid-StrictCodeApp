package com.example.academy_intern.stric_code.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.academy_intern.stric_code.R;
import com.example.academy_intern.stric_code.implementation.DataSource;
import com.example.academy_intern.stric_code.models.User;

public class fragmentLogin extends Fragment {
    View view;
    Button btnLogin;
    EditText etEmail,etPassword;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return (view = inflater.inflate(R.layout.login, container, false));
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        init();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = (etEmail = view.findViewById(R.id.etEmail)).getText().toString();
                String password = (etPassword = view.findViewById(R.id.etPassword)).getText().toString();

                DataSource dataSource = new DataSource();
                User user = dataSource.isloggedIn(email,password);

                dataSource.init();



                if(user != null){

                    String name = user.getName();
                    Toast.makeText(getActivity(),"Welcome "+name,Toast.LENGTH_LONG).show();


                   getFragmentManager().beginTransaction().replace(R.id.mainId, new fragmentDisplay()).commit();


                }else{
                    Toast.makeText(getActivity(),"Couldn't login,please try again",Toast.LENGTH_LONG).show();
                }


            }
        });

    }

    public void init(){
        btnLogin = view.findViewById(R.id.btnLogin);

    }
}
