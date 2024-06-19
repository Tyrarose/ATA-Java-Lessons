package com.accenture.model;

public abstract class MutualFund {
    protected double navps;
    protected double salesLoadPercentage;

    public MutualFund(double navps, double salesLoadPercentage) {
        this.navps = navps;
        this.salesLoadPercentage = salesLoadPercentage;
    }

    public double getNavps() {
        return navps;
    }

    public abstract double computeSalesLoad(double investmentAmount);

    public abstract double netAmountInvested(double investmentAmount);

    public abstract double purchasedShares(double investmentAmount);
}
