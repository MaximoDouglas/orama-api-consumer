package com.maximo.douglas.oramaapiconsumer.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.databinding.DataBindingUtil;

import com.google.android.material.card.MaterialCardView;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.databinding.CardviewFundBinding;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

public class FundCardView extends MaterialCardView {
    public FundCardView(Context context) {
        super(context);
    }

    public FundCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FundCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private final CardviewFundBinding cardviewFundBinding = DataBindingUtil.inflate(
            LayoutInflater.from(getContext()), R.layout.cardview_fund, this, true
    );

    public void setFundObject(Fund fund) {
        cardviewFundBinding.setFund(fund);
        cardviewFundBinding.executePendingBindings();
    }

}
