package com.example.mad.ui.EmergencyContactsEdit;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmergencyEditViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EmergencyEditViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}