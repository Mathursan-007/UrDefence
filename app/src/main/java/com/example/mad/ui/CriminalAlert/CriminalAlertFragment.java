package com.example.mad.ui.CriminalAlert;

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

public class CriminalAlertFragment extends Fragment {

    private CriminalAlertViewModel CriminalAlertViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CriminalAlertViewModel =
                ViewModelProviders.of(this).get(CriminalAlertViewModel.class);
        View root = inflater.inflate(R.layout.criminal_alert, container, false);
        final TextView textView = root.findViewById(R.id.textView14);
        final TextView textView1 = root.findViewById(R.id.textView17);
        final TextView textView2 = root.findViewById(R.id.textView34);
        CriminalAlertViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                textView1.setText(s);
                textView2.setText(s);
            }
        });
        return root;
    }
}
