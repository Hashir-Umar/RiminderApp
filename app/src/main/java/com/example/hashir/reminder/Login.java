package com.example.hashir.reminder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Login extends Fragment {


    public Login() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Toast.makeText(getContext(), "hello", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

}
