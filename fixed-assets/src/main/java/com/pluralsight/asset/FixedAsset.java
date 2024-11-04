package com.pluralsight.asset;

public abstract class FixedAsset {
    String name;
    double marketValue;

    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getValue() {

    }
}
