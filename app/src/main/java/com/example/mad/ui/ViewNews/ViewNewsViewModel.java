package com.example.mad.ui.ViewNews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewNewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ViewNewsViewModel() {
        mText = new MutableLiveData<>();
    //    mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}