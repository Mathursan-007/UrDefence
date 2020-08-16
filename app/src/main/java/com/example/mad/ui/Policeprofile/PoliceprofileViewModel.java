package com.example.mad.ui.Policeprofile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PoliceprofileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PoliceprofileViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}