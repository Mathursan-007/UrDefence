package com.example.mad.ui.CriminalRegister;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CriminalRegisterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CriminalRegisterViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}