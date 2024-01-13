package com.myblog2.demo.myblog.Stream;

public class product {
    private long productId;
    private String productName;
    private String productCompany;

    public product(long productId, String productName, String productCompany) {
        this.productId = productId;
        this.productName = productName;
        this.productCompany = productCompany;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCompany() {
        return productCompany;
    }
}
