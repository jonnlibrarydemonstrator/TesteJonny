package com.njdevelopment.testejonny.List;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.njdevelopment.testejonny.R;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private int HOLDER_ONE = 0;
    private int HOLDER_TWO = 1;

    private ModelList modelList;

    Adapter(ModelList model) {
        modelList = model;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HOLDER_ONE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_one, parent, false);
            return new HolderOne(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_two, parent, false);
            return new HolderTwo(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HolderOne) {
            HolderOne holderOne = (HolderOne) holder;
            holderOne.tx1.setText(modelList.getText());
            holderOne.tx2.setText(modelList.getPosition());
        } else if (holder instanceof HolderTwo) {
            HolderTwo holderTwo = (HolderTwo) holder;
            holderTwo.tx1.setText(modelList.getText());
            holderTwo.tx2.setText(modelList.getPosition());
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        String type = modelList.getPosition();

        if (type.equals("0")) {
            return HOLDER_ONE;
        } else {
            return HOLDER_TWO;
        }


    }
}
