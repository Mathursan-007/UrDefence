package com.example.mad.ui.Emergency;

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

public class EmergencyFragment extends Fragment {

    private EmergencyViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(EmergencyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_emergency, container, false);
        final TextView textView = root.findViewById(R.id.textView26);
        final TextView textView1 = root.findViewById(R.id.textView27);
        final TextView textView2 = root.findViewById(R.id.textView28);
        final TextView textView3 = root.findViewById(R.id.textView29);
        final TextView textView4 = root.findViewById(R.id.textView30);
        final TextView textView5 = root.findViewById(R.id.textView31);
        final TextView textView6 = root.findViewById(R.id.textView32);
        final TextView textView7 = root.findViewById(R.id.textView33);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                textView1.setText(s);
                textView2.setText(s);
                textView3.setText(s);
                textView4.setText(s);
                textView5.setText(s);
                textView6.setText(s);
                textView7.setText(s);
            }
        });
        return root;
    }
}