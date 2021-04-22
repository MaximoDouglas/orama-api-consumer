package com.maximo.douglas.oramaapiconsumer.domain.entity.fund;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Document {

    @SerializedName("position")
    @Expose
    private String position;

    @SerializedName("document_type")
    @Expose
    private String documentType;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("document_url")
    @Expose
    private String documentUrl;

    public String getPosition() {
        return position;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getName() {
        return name;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }
}
