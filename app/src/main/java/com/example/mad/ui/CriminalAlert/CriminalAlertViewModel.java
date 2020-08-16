package com.example.mad.ui.CriminalAlert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CriminalAlertViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CriminalAlertViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
