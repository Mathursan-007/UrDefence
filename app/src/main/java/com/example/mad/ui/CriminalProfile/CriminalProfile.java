package com.example.mad.ui.CriminalProfile;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mad.R;
import com.example.mad.ui.Wanted.WantedViewModel;

public class CriminalProfile extends Fragment {

    private WantedViewModel wantedViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wantedViewModel =
                ViewModelProviders.of(this).get(WantedViewModel.class);
        View root = inflater.inflate(R.layout.wanted, container, false);
        final TextView textView = root.findViewById(R.id.textView);
        final TextView textView1 = root.findViewById(R.id.textView2);
        final TextView textView2 = root.findViewById(R.id.textView3);
        final TextView textView3 = root.findViewById(R.id.textView4);
        final TextView textView4 = root.findViewById(R.id.textView5);
        wantedViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                textView1.setText(s);
                textView2.setText(s);
                textView3.setText(s);
                textView4.setText(s);
            }
        });


        return root;


    }
}