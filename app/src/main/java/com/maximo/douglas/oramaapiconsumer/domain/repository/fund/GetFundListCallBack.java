package com.maximo.douglas.oramaapiconsumer.domain.repository.fund;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

public interface GetFundListCallBack {

    void getFundListSuccess(List<Fund> fundList);

    void getFundListFailure(Throwable throwable);

}
