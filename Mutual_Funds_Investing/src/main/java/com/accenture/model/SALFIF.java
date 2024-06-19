package com.accenture.model;

public class SALFIF extends MutualFund {
    public SALFIF() {
        super(2.5678, 0.01); // Example values for NAVPS and sales load percentage
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
