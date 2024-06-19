package com.accenture.model;

public class SALBF extends MutualFund {
    public SALBF() {
        super(3.1234, 0.015); // Example values for NAVPS and sales load percentage
    }

    @Override
    public double computeSalesLoad(double investmentAmount) {
        return investmentAmount * salesLoadPercentage;
    }

    @Override
    public double netAmountInvested(double investmentAmount) {
        return investmentAmount - computeSalesLoad(investmentAmount);
    }

    @Override
    public double purchasedShares(double investmentAmount) {
        return netAmountInvested(investmentAmount) / navps;
    }
}
