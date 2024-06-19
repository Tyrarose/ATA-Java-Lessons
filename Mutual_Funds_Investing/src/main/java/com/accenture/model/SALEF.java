package com.accenture.model;

public class SALEF extends MutualFund {
    public SALEF() {
        super(4.6731, 0.02); // Example values for NAVPS and sales load percentage
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
