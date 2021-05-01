package com.maximo.douglas.oramaapiconsumer.ui.fundlisting;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.domain.repository.fund.FundRepository;
import com.maximo.douglas.oramaapiconsumer.domain.repository.fund.GetFundListCallBack;

import java.util.List;

public class FundListingViewModel extends ViewModel {

    private final FundRepository fundRepository;

    public FundListingViewModel(FundRepository fundRepository) {
        this.fundRepository = fundRepository;
    }

    private final MutableLiveData<List<Fund>> mMutableFundList = new MutableLiveData<>();
    private final LiveData<List<Fund>> mFundList = mMutableFundList;

    public LiveData<List<Fund>> getFundListLiveData() {
        return mFundList;
    }

    public void requestFundList() {
        fundRepository.getFundList(new GetFundListCallBack() {
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

    static class ViewModelFactory implements ViewModelProvider.Factory {

        private final FundRepository fundRepository;

        public ViewModelFactory(FundRepository fundRepository) {
            this.fundRepository = fundRepository;
        }

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            return (T) new FundListingViewModel(fundRepository);
        }
    }

}