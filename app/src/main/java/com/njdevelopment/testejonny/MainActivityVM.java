package com.njdevelopment.testejonny;

import android.app.Activity;
import android.databinding.ObservableField;
import android.view.View;

public class MainActivityVM {

    private Model model;

    public ObservableField<String> text = new ObservableField<>();

    MainActivityVM(Activity activity) {
        model = new Model(activity);
    }

    public View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            text.set(model.getText());
        }
    };

}
