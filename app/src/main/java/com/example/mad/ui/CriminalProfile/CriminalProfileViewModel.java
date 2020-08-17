package com.example.mad.ui.CriminalProfile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CriminalProfileViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CriminalProfileViewModel() {
        mText = new MutableLiveData<>();
        //    mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}