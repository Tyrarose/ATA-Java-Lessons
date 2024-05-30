package bpi.com.ph.controller;

import bpi.com.ph.model.Forex;

public class DemoClassAndObject {
	
    public static void main(String[] args) {
    	
        Forex objJuanDelaCruz = new Forex();

        // use the dot notation (.), you can access instance variable and instance
        // methods

        objJuanDelaCruz.setCustomerName("Juan dela Cruz");
        objJuanDelaCruz.setPesoAmount(150000);
        objJuanDelaCruz.setTargetCurrency("USD");

        // call the business logic for compute
        objJuanDelaCruz.compute();
        
        System.out.println("Welcome to BPI Forex Application 02");
        if(objJuanDelaCruz.isValid()) {
        	// perform a display to the end user
            System.out.println("Customer Name: " + objJuanDelaCruz.getCustomerName());
            System.out.println("Peso Amount: " + objJuanDelaCruz.getPesoAmount());
            System.out.println("Currency selected: " + objJuanDelaCruz.getTargetCurrency());

            System.out.println(
                    "\nThe equivalent of Php " + objJuanDelaCruz.pesoAmount + " is " + objJuanDelaCruz.equivalentAmout);
        } else {
        	System.err.println("Invalid currency. Please select valid currency.");
        }

        
        
    }
    
}

