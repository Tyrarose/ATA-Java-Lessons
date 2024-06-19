package com.accenture.model;

import com.accenture.exceptions.InvalidFundSelectionException;
import com.accenture.exceptions.InvalidInvestmentAmountInputException;

public class Validation implements ValidateUserData {

    @Override
    public boolean isValidInvestmentAmount(double amount) throws InvalidInvestmentAmountInputException {
        if (amount < 1000) {
            throw new InvalidInvestmentAmountInputException("Investment amount must be at least Php 1000.00");
        }
        return true;
    }

    @Override
    public boolean isValidFundSelection(String fundType) throws InvalidFundSelectionException {
        if (!(fundType.equalsIgnoreCase("SALEF") || fundType.equalsIgnoreCase("SALBF") || fundType.equalsIgnoreCase("SALFIF"))) {
            throw new InvalidFundSelectionException("Invalid fund type selected");
        }
        return true;
    }
}
