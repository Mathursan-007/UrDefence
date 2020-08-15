package com.example.mad.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mad.R;
import com.example.mad.ui.home.HomeViewModel;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView1 = root.findViewById(R.id.textView1);
        final TextView textView2 = root.findViewById(R.id.textView2);
        final TextView textView3 = root.findViewById(R.id.textView3);
        final TextView textView4 = root.findViewById(R.id.textView4);
        final TextView textView5 = root.findViewById(R.id.textView5);
        final TextView textView6 = root.findViewById(R.id.textView6);
        final TextView textView7 = root.findViewById(R.id.textView7);
        final TextView textView8 = root.findViewById(R.id.textView8);
        final TextView textView9 = root.findViewById(R.id.textView9);
        final TextView textView10 = root.findViewById(R.id.textView10);
        final TextView textView11 = root.findViewById(R.id.textView11);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView1.setText(s);
                textView2.setText(s);
                textView3.setText(s);
                textView4.setText(s);
                textView5.setText(s);
                textView6.setText(s);
                textView7.setText(s);
                textView8.setText(s);
                textView9.setText(s);
                textView10.setText(s);
                textView11.setText(s);
            }
        });
        return root;
    }
}