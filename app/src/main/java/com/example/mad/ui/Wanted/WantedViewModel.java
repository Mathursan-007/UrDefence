package com.example.mad.ui.Wanted;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WantedViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WantedViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}