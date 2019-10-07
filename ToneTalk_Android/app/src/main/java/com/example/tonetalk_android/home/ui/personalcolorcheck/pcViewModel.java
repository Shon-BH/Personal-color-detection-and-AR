package com.example.tonetalk_android.home.ui.personalcolorcheck;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class pcViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public pcViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Personal Color");
    }

    public LiveData<String> getText() {
        return mText;
    }
}