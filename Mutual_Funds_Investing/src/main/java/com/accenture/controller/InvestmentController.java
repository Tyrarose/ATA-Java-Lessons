package com.accenture.controller;

import com.accenture.model.*;
import com.accenture.exceptions.InvalidFundSelectionException;
import com.accenture.exceptions.InvalidInvestmentAmountInputException;

public class InvestmentController {
    private MutualFund fund;
    private Validation validation;

    public InvestmentController() {
        validation = new Validation();
    }

    public void setFund(String fundType) throws InvalidFundSelectionException {
        if (validation.isValidFundSelection(fundType)) {
            switch (fundType.toUpperCase()) {
                case "SALEF":
                    fund = new SALEF();
                    break;
                case "SALBF":
                    fund = new SALBF();
                    break;
                case "SALFIF":
                    fund = new SALFIF();
                    break;
            }
        }
    }

    public MutualFund getFund() {
        return fund;
    }

    public boolean validateInvestmentAmount(double amount) throws InvalidInvestmentAmountInputException {
        return validation.isValidInvestmentAmount(amount);
    }
}
