package com.maximo.douglas.oramaapiconsumer.ui.funddetail;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.databinding.FragmentFundDetailBinding;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.utils.NavigationArgumentKeys;

import org.jetbrains.annotations.NotNull;

import static com.maximo.douglas.oramaapiconsumer.utils.FragmentUtils.bundleContainsKeys;

public class FundDetailFragment extends Fragment {

    private FundDetailViewModel fundDetailViewModel;
    private FragmentFundDetailBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_fund_detail, container, false);

        mBinding.setFragment(this);
        mBinding.setShowProfitabilities(false);
        mBinding.setShowSpecification(false);
        mBinding.setShowObjective(false);
        mBinding.setShowManagerData(false);

        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewModel();

        if (savedInstanceState != null) {
            extractDataFromInstanceState(savedInstanceState);
        } else if (getArguments() != null) {
            extractDataFromArguments(getArguments());
        }
    }

    private void extractDataFromInstanceState(Bundle savedInstanceState) {
        Boolean bundleContainsKeys = bundleContainsKeys(savedInstanceState, NavigationArgumentKeys.KEY_FUND_DETAIL.value);

        if (bundleContainsKeys) {
            Fund fundDetail = savedInstanceState.getParcelable(NavigationArgumentKeys.KEY_FUND_DETAIL.value);
            fundDetailViewModel.setFundDetail(fundDetail);
        }
    }

    private void extractDataFromArguments(@NotNull Bundle arguments) {
        Fund fundDetail = FundDetailFragmentArgs.fromBundle(arguments).getFund();
        fundDetailViewModel.setFundDetail(fundDetail);
    }

    private void setupViewModel() {
        if (fundDetailViewModel == null) {
            fundDetailViewModel = new ViewModelProvider(this).get(FundDetailViewModel.class);
        }

        fundDetailViewModel.getFundDetailLiveData().observe(getViewLifecycleOwner(), this::handleFundDetailStateChange);
    }

    private void handleFundDetailStateChange(Fund fund) {
        mBinding.setFund(fund);
        mBinding.fragmentFundDetailProfitability.setProfitabilities(fund.getProfitabilities());
        mBinding.fragmentFundDetailSpecification.setSpecification(fund.getSpecification());
    }

    @SuppressLint("NonConstantResourceId")
    public void changeVisibility(View view, Boolean isVisible) {
        switch (view.getId()) {
            case R.id.fragment_fund_detail_profitabilities_head_line:
                mBinding.setShowProfitabilities(!isVisible);
                break;
            case R.id.fragment_fund_detail_specification_head_line:
                mBinding.setShowSpecification(!isVisible);
                break;
            case R.id.fragment_fund_detail_objective_head_line:
                mBinding.setShowObjective(!isVisible);
                break;
            case R.id.fragment_fund_detail_manager_head_line:
                mBinding.setShowManagerData(!isVisible);
                break;
        }
    }

}