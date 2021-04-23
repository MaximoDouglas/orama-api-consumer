package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.specification.Specification;
import com.maximo.douglas.oramaapiconsumer.utils.MathUtils;

import java.util.ArrayList;
import java.util.Date;

public class Fund {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("fees")
    @Expose
    private Fee fees;

    @SerializedName("is_simple")
    @Expose
    private Boolean isSimple;

    @SerializedName("description_seo")
    @Expose
    private String descriptionSeo;

    @SerializedName("operability")
    @Expose
    private Operability operability;

    @SerializedName("full_name")
    @Expose
    private String fullName;

    @SerializedName("opening_date")
    @Expose
    private Date openingDate;

    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;

    @SerializedName("simple_name")
    @Expose
    private String simpleName;

    @SerializedName("documents")
    @Expose
    private ArrayList<Document> documents;

    @SerializedName("specification")
    @Expose
    private Specification specification;

    @SerializedName("quota_date")
    @Expose
    private Date quotaDate;

    @SerializedName("tax_classification")
    @Expose
    private String taxClassification;

    @SerializedName("cnpj")
    @Expose
    private String cnpj;

    @SerializedName("description")
    @Expose
    private Description description;

    @SerializedName("is_active")
    @Expose
    private Boolean isActive;

    @SerializedName("benchmark")
    @Expose
    private Benchmark benchmark;

    @SerializedName("orama_standard")
    @Expose
    private Boolean oramaStandard;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("fund_situation")
    @Expose
    private FundSituation fundSituation;

    @SerializedName("volatility_12m")
    @Expose
    private String volatility12m;

    @SerializedName("profitabilities")
    @Expose
    private Profitabilities profitabilities;

    @SerializedName("closed_to_capture_explanation")
    @Expose
    private String closedToCaptureExplanation;

    @SerializedName("net_patrimony_12m")
    @Expose
    private String netPatrimony12M;

    @SerializedName("fund_manager")
    @Expose
    private FundManager fundManager;

    @SerializedName("esg_seal")
    @Expose
    private String esgSeal;

    public Fund(String simpleName, Operability operability, String volatility12m) {
        this.simpleName = simpleName;
        this.operability = operability;
        this.volatility12m = volatility12m;
    }

    public Integer getId() {
        return id;
    }

    public Fee getFees() {
        return fees;
    }

    public Boolean getSimple() {
        return isSimple;
    }

    public String getDescriptionSeo() {
        return descriptionSeo;
    }

    public Operability getOperability() {
        return operability;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getOpeningDate() {
        return openingDate;
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

    public String getCnpj() {
        return cnpj;
    }

    public Description getDescription() {
        return description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Benchmark getBenchmark() {
        return benchmark;
    }

    public Boolean getOramaStandard() {
        return oramaStandard;
    }

    public String getSlug() {
        return slug;
    }

    public FundSituation getFundSituation() {
        return fundSituation;
    }

    public String getVolatility12m() {
        return volatility12m;
    }

    public String getFormattedVolatility12m() {
        double volatilityDouble = Double.parseDouble(volatility12m) * 100;

        return String.valueOf(MathUtils.round(volatilityDouble, 2));
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    public String getClosedToCaptureExplanation() {
        return closedToCaptureExplanation;
    }

    public String getNetPatrimony12M() {
        return netPatrimony12M;
    }

    public FundManager getFundManager() {
        return fundManager;
    }

    public String getEsgSeal() {
        return esgSeal;
    }
}
