package com.njdevelopment.testejonny.List;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.njdevelopment.testejonny.R;

public class HolderTwo extends RecyclerView.ViewHolder {
    @SuppressLint("StaticFieldLeak")
    protected static View view;
    public TextView tx1;
    public TextView tx2;

    HolderTwo(View itemView) {
        super(itemView);
        view = itemView;

        tx1 = view.findViewById(R.id.tx1);
        tx2 = view.findViewById(R.id.tx2);
    }

    public static View getView(){
        return view;
    }
}
