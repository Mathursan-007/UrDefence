package com.example.mad.ui.Alert;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlertViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlertViewModel() {
        mText = new MutableLiveData<>();
     //   mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}