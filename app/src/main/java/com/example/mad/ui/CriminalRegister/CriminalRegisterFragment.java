package com.example.mad.ui.CriminalRegister;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mad.R;


public class CriminalRegisterFragment extends Fragment {

    private CriminalRegisterViewModel criminalRegisterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        criminalRegisterViewModel =
                ViewModelProviders.of(this).get(CriminalRegisterViewModel.class);
        View root = inflater.inflate(R.layout.criminal_register, container, false);
        final TextView textView = root.findViewById(R.id.textView5);
        final TextView textView1 = root.findViewById(R.id.textView6);
        final TextView textView2 = root.findViewById(R.id.textView8);
        final TextView textView3 = root.findViewById(R.id.textView9);
        final TextView textView4 = root.findViewById(R.id.textView10);
        final TextView textView5 = root.findViewById(R.id.textView11);
        criminalRegisterViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                textView1.setText(s);
                textView2.setText(s);
                textView3.setText(s);
                textView4.setText(s);
                textView5.setText(s);
            }
        });
        return root;
    }
}