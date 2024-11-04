package com.pluralsight.asset;

public class Gold extends FixedAsset{
    double weight;

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    public double getValue() {
        return marketValue;
    }
}
