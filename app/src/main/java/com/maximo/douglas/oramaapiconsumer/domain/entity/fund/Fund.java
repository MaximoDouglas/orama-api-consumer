package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.Specification;
import com.maximo.douglas.oramaapiconsumer.utils.MathUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Fund implements Serializable {
    @SerializedName("id")
    @Expose
    protected Integer id;

    @SerializedName("fees")
    @Expose
    protected Fee fees;

    @SerializedName("is_simple")
    @Expose
    protected Boolean isSimple;

    @SerializedName("operability")
    @Expose
    protected Operability operability;

    @SerializedName("full_name")
    @Expose
    protected String fullName;

    @SerializedName("is_closed")
    @Expose
    protected Boolean isClosed;

    @SerializedName("simple_name")
    @Expose
    protected String simpleName;

    @SerializedName("documents")
    @Expose
    protected ArrayList<Document> documents;

    @SerializedName("specification")
    @Expose
    protected Specification specification;

    @SerializedName("quota_date")
    @Expose
    protected Date quotaDate;

    @SerializedName("tax_classification")
    @Expose
    protected String taxClassification;

    @SerializedName("description")
    @Expose
    protected Description description;

    @SerializedName("is_active")
    @Expose
    protected Boolean isActive;

    @SerializedName("fund_situation")
    @Expose
    protected FundSituation fundSituation;

    @SerializedName("volatility_12m")
    @Expose
    protected String volatility12m;

    @SerializedName("profitabilities")
    @Expose
    protected Profitabilities profitabilities;

    @SerializedName("net_patrimony_12m")
    @Expose
    protected String netPatrimony12M;

    @SerializedName("fund_manager")
    @Expose
    protected FundManager fundManager;

    public Fund(
            Boolean isSimple,
            Operability operability,
            String simpleName,
            Specification specification,
            Description description,
            String volatility12m,
            Profitabilities profitabilities,
            FundManager fundManager
    ) {
        this.isSimple = isSimple;
        this.operability = operability;
        this.simpleName = simpleName;
        this.specification = specification;
        this.description = description;
        this.volatility12m = volatility12m;
        this.profitabilities = profitabilities;
        this.fundManager = fundManager;
    }

    public Integer getId() {
        return id;
    }

    public Fee getFees() {
        return fees;
    }

    public Boolean getIsSimple() {
        return isSimple;
    }

    public Operability getOperability() {
        return operability;
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public Specification getSpecification() {
        return specification;
    }

    public Date getQuotaDate() {
        return quotaDate;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    public Description getDescription() {
        return description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public FundSituation getFundSituation() {
        return fundSituation;
    }

    public String getVolatility12m() {
        return volatility12m;
    }

    public String getFormattedVolatility12m() {
        return MathUtils.formatStringPercent(volatility12m);
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    public String getNetPatrimony12M() {
        return netPatrimony12M;
    }

    public FundManager getFundManager() {
        return fundManager;
    }

}
