package com.example.Apple.model;

public class CompanyDetails {

    private String name;
    private String industry;
    private String CEO;
    private String revenue;

    public CompanyDetails(String name, String industry, String CEO, String revenue) {
        this.name = name;
        this.industry = industry;
        this.CEO = CEO;
        this.revenue = revenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
}
