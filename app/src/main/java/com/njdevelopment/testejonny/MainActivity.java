package com.njdevelopment.testejonny;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.njdevelopment.testejonny.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();
    }

    private void initVars() {
        activity = MainActivity.this;
        MainActivityVM model = new MainActivityVM(activity);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setAddVM(model);
        binding.executePendingBindings();
    }

    private void initActions() {
        binding.btn.setOnClickListener(binding.getAddVM().btnClick);
    }
}
