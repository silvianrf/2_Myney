package com.example.myney.ui.pengeluaran;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PengeluaranViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PengeluaranViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}