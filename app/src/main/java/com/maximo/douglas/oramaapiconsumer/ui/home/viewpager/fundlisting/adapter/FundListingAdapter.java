package com.maximo.douglas.oramaapiconsumer.ui.home.viewpager.fundlisting.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.databinding.CardviewFundBinding;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

public class FundListingAdapter extends RecyclerView.Adapter<FundListingAdapter.FundViewHolder> {

    private List<Fund> fundList;
    private OnFundClickListener onFundClickListener;

    public FundListingAdapter(OnFundClickListener onFundClickListener) {
        this.onFundClickListener = onFundClickListener;
    }

    @NonNull
    @Override
    public FundViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        CardviewFundBinding cardviewFundBinding = DataBindingUtil.inflate(LayoutInflater.from(
                viewGroup.getContext()), R.layout.cardview_fund, viewGroup, false);

        return new FundViewHolder(cardviewFundBinding);
    }

    public void setData(List<Fund> fundList) {
        this.fundList = fundList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull FundViewHolder fundViewHolder, int position) {
        Fund currentFund = fundList.get(position);
        fundViewHolder.cardviewFundBinding.setFund(currentFund);
    }

    @Override
    public int getItemCount() {
        if (fundList != null) {
            return fundList.size();
        } else {
            return 0;
        }
    }

    class FundViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final CardviewFundBinding cardviewFundBinding;

        public FundViewHolder(@NonNull CardviewFundBinding cardviewFundBinding) {
            super(cardviewFundBinding.getRoot());

            this.cardviewFundBinding = cardviewFundBinding;
            this.cardviewFundBinding.getRoot().setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onFundClickListener.onClick(cardviewFundBinding.getFund().getId());
        }
    }
}
