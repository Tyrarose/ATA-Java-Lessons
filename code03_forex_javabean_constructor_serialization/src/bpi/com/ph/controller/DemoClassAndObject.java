package bpi.com.ph.controller;

import bpi.com.ph.model.ForexBean;

public class DemoClassAndObject {
	
    public static void main(String[] args) {
    	
        ForexBean objJuanDelaCruz = new ForexBean();

        // use the dot notation (.), you can access instance variable and instance
        // methods

        objJuanDelaCruz.customerName = "Jean dela Cruz";
        objJuanDelaCruz.pesoAmount = 150000;
        objJuanDelaCruz.targetCurrency = "USD";

        // call the business logic for compute
        objJuanDelaCruz.compute();
        
        System.out.println("Welcome to BPI Forex Application 03");
        
        if(objJuanDelaCruz.isValid()) {
        	// perform a display to the end user
            System.out.println("Wlecome to BPI Forex Application");
            System.out.println("Customer Name: " + objJuanDelaCruz.customerName);
            System.out.println("Peso Amount: " + objJuanDelaCruz.pesoAmount);
            System.out.println("Currency selected: " + objJuanDelaCruz.targetCurrency);

            System.out.println(
                    "\nThe equivalent of Php " + objJuanDelaCruz.pesoAmount + " is " + objJuanDelaCruz.equivalentAmout);
        } else {
        	System.err.println("Invalid currency. Please select valid currency.");
        }

        
        
    }
    
}

