package com.accenture.view;

import com.accenture.controller.InvestmentController;
import com.accenture.model.MutualFund;
import com.accenture.exceptions.InvalidFundSelectionException;
import com.accenture.exceptions.InvalidInvestmentAmountInputException;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InvestmentView {
    private InvestmentController controller;
    private Scanner scanner;

    public InvestmentView() {
        controller = new InvestmentController();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean continueProgram = true;

        while (continueProgram) {
            try {
                System.out.print("Enter Investor Name: ");
                String investorName = scanner.nextLine();

                System.out.print("Enter Mutual Fund Type: ");
                String fundType = scanner.nextLine();

                controller.setFund(fundType);

                System.out.print("Enter Investment Amount: ");
                double amount = Double.parseDouble(scanner.nextLine());

                if (controller.validateInvestmentAmount(amount)) {
                    MutualFund fund = controller.getFund();
                    double salesLoad = fund.computeSalesLoad(amount);
                    double netAmount = fund.netAmountInvested(amount);
                    double shares = fund.purchasedShares(amount);

                    LocalDate currentDate = LocalDate.now();
                    String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"));

                    System.out.printf("Investor Name is %s.\n", investorName);
                    System.out.printf("Investment Fund Type is %s.\n", getFundFullName(fundType));
                    System.out.printf("Amount invested is Php%.2f.\n", amount);
                    System.out.printf("NAVPS: Php%.4f (as of %s)\n", fund.getNavps(), formattedDate);
                    System.out.printf("Sales Load Amount: Php%.2f\n", salesLoad);
                    System.out.printf("Net Amount Invested: Php%.2f\n", netAmount);
                    System.out.printf("Total Shares Bought: %.5f\n", shares);

                    System.out.print("Do you want to continue [Y/N]? ");
                    String response = scanner.nextLine();
                    if (!response.equalsIgnoreCase("Y")) {
                        continueProgram = false;
                    }
                }
            } catch (InvalidFundSelectionException | InvalidInvestmentAmountInputException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount format. Please enter a numeric value.");
            }
        }
    }

    private String getFundFullName(String fundType) {
        switch (fundType.toUpperCase()) {
            case "SALEF":
                return "Save and Learn Equity Fund";
            case "SALBF":
                return "Save and Learn Balanced Fund";
            case "SALFIF":
                return "Save and Learn Fixed Income Fund";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        new InvestmentView().start();
    }
}
