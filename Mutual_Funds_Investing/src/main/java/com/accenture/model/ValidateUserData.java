package com.accenture.model;

import com.accenture.exceptions.InvalidFundSelectionException;
import com.accenture.exceptions.InvalidInvestmentAmountInputException;

public interface ValidateUserData {
    boolean isValidInvestmentAmount(double amount) throws InvalidInvestmentAmountInputException;
    boolean isValidFundSelection(String fundType) throws InvalidFundSelectionException;
}
