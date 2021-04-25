package com.maximo.douglas.oramaapiconsumer.ui.funddetail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

public class FundDetailViewModel extends ViewModel {

    private final MutableLiveData<Fund> mMutableFundDetail = new MutableLiveData<>();
    private final LiveData<Fund> mFundDetail = mMutableFundDetail;

    public LiveData<Fund> getFundDetailLiveData() {
        return mFundDetail;
    }

    public void setFundDetail(Fund fund) {
        mMutableFundDetail.setValue(fund);
    }

    public Fund getFundDetail() {
        return mFundDetail.getValue();
    }
}