package com.maximo.douglas.oramaapiconsumer.ui.fundlisting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.GetFundListCallBack;
import com.maximo.douglas.oramaapiconsumer.di.InjectionRemoteDataSource;

import java.util.List;

public class FundListingViewModel extends ViewModel {

    private final FundRemoteDataSource fundRemoteDataSource = InjectionRemoteDataSource.provideFundRemoteDataSource();

    private final MutableLiveData<List<Fund>> mMutableFundList = new MutableLiveData<>();
    private final LiveData<List<Fund>> mFundList = mMutableFundList;

    public LiveData<List<Fund>> getFundListLiveData() {
        return mFundList;
    }

    public void requestFundList() {
        fundRemoteDataSource.getFundApiList(new GetFundListCallBack() {
            @Override
            public void getFundListSuccess(List<Fund> fundList) {
                mMutableFundList.setValue(fundList);
            }

            @Override
            public void getFundListFailure(Throwable throwable) {
                System.out.println("DEU ERRO OTÁRIO");
            }
        });
    }

}