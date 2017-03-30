package com.example.android.scorekeeper;

import android.app.Fragment;
import android.os.Bundle;

public class RetainedFragment<T> extends Fragment {
    public T data;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //retain this fragment
        setRetainInstance(true);
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}