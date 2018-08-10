package com.njdevelopment.testejonny;

import android.app.Activity;

import com.njdevelopment.testejonny.List.ModelList;

import java.util.Random;

public class Model {

    private Activity activity;

    Model(Activity activity) {
        this.activity = activity;
    }

    public String getText() {
        return activity.getResources().getString(R.string.textMVVM);
    }

    public ModelList getList() {

        int quant = 300;

        ModelList model = new ModelList();

        for (int i = 0; i < quant; i++) {
            model.setText("Text Gerated at position " + i);
            model.setPosition(String.valueOf(i));
            model.setType(String.valueOf(getRamdom()));
        }

        return model;
    }

    private int getRamdom(){
        Random n = new Random();
       return n.nextInt(2);
    }
}
