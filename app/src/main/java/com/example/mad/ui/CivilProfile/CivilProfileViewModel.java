package com.example.mad.ui.CivilProfile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CivilProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CivilProfileViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is slideshow fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}