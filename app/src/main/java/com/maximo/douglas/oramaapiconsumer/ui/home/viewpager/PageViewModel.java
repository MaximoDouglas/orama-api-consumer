package com.maximo.douglas.oramaapiconsumer.ui.home.viewpager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.GetFundListCallBack;
import com.maximo.douglas.oramaapiconsumer.service.injections.InjectionRemoteDataSource;

import java.util.List;

public class PageViewModel extends ViewModel {

    private final FundRemoteDataSource fundRemoteDataSource = InjectionRemoteDataSource.provideFundRemoteDataSource();

    private final MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private final LiveData<String> mText = Transformations.map(mIndex, input -> "Hello world from section: " + input);

    private MutableLiveData<List<Fund>> mMutableFundList = new MutableLiveData<>();
    private LiveData<List<Fund>> mFundList = mMutableFundList;

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

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
            public void getFundListFailure(Throwable throwable) {}
        });
    }

}