package com.maximo.douglas.oramaapiconsumer.ui.viewpager.fundlisting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.databinding.FragmentFundListingBinding;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.ui.viewpager.fundlisting.adapter.FundListingAdapter;
import com.maximo.douglas.oramaapiconsumer.ui.viewpager.fundlisting.adapter.OnFundClickListener;

import java.util.ArrayList;
import java.util.List;

import static androidx.navigation.Navigation.findNavController;

public class FundListingFragment extends Fragment implements OnFundClickListener {

    private FundListingViewModel fundListingViewModel;
    private FragmentFundListingBinding mBinding;

    private final FundListingAdapter fundListingAdapter = new FundListingAdapter(this);

    private List<Fund> fundList = new ArrayList<>();

    private Bundle fragmentState;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_fund_listing, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecyclerView();
        setupViewModel();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (this.fundList == null || this.fundList.size() == 0) {
            fundListingViewModel.requestFundList();
        }
    }

    private void setupViewModel() {
        if (fundListingViewModel == null) {
            fundListingViewModel = new ViewModelProvider(this).get(FundListingViewModel.class);
        }

        fundListingViewModel.getFundListLiveData().observe(getViewLifecycleOwner(), this::handleFundListStateChange);
    }

    private void handleFundListStateChange(List<Fund> fundList) {
        this.fundList = fundList;
        fundListingAdapter.setData(this.fundList);
        fundListingAdapter.notifyDataSetChanged();
        mBinding.executePendingBindings();
    }

    private void setupRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        mBinding.fundListingRecyclerView.setLayoutManager(linearLayoutManager);

        mBinding.fundListingRecyclerView.setAdapter(fundListingAdapter);
    }

    @Override
    public void onClick(Integer fundId) {
        Fund selectedFund = searchFundById(fundId);

        findNavController(mBinding.fundListingRecyclerView).navigate(
                FundListingFragmentDirections.actionFundListingFragmentToFundDetailFragment(selectedFund)
        );
    }

    private Fund searchFundById(Integer fundId) {
        return fundList.stream().filter(fund ->
                fund.getId().equals(fundId)).findFirst().orElse(null
        );
    }
}