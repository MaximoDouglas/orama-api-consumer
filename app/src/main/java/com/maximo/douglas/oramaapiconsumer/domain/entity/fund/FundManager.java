package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FundManager {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("full_name")
    @Expose
    private String fullName;

    @SerializedName("logo")
    @Expose
    private String logo;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("name")
    @Expose
    private String name;

    public FundManager(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogo() {
        return logo;
    }

    public String getSlug() {
        return slug;
    }

    public String getName() {
        return name;
    }
}
