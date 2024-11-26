package com.brazilian_funds_management.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "funds")
public class Fund {
    @Id
    private String id;
    private String name;
    private String type;
    private double netAssetValue;
    private double expenseRatio;
    private String manager;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getNetAssetValue() {
        return netAssetValue;
    }

    public void setNetAssetValue(double netAssetValue) {
        this.netAssetValue = netAssetValue;
    }

    public double getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(double expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}