package bpi.com.ph.model;

import java.io.Serializable;

public class ForexBean implements Serializable{

    

    // input values (instance variable)
    public String customerName; // defaulted to null
    public double pesoAmount; // defaulted to 0.0
    public String targetCurrency; // defaulted to null

    // computed values (instance variables)
    public double equivalentAmout; // defaulted to 0.0
    public String equivalentCurrency; // defaulted to null
    public boolean isValid; // defaulted to false
    
    
    // no-arg constructor
    // constructor are usually placed below the global variable declarations
 	public ForexBean(){
 		customerName = "";
 		targetCurrency = "";
 		equivalentCurrency = "";
 		
 		System.out.println("\ninitializatio of String objects completed. \n");
 	}
 	
    
    public String getCustomerName() {
    	return customerName;
    }
    
    public void setCustomerName(String customerName) {
    	this.customerName = customerName;
    }
    
    public double getPesoAmount() {
    	return pesoAmount;
    }
    
    public void setPesoAmount(double pesoAmount) {
    	this.pesoAmount = pesoAmount;
    }
    
    public String getTargetCurrency() {
    	return targetCurrency;
    }
    
    public void setTargetCurrency(String targetCurrency) {
    	this.targetCurrency = targetCurrency;
    }
    
    public double getEquivalentAmount() {
    	return equivalentAmout;
    }
    
    public void setEquivalentAmount(double equivalentAmout) {
    	this.equivalentAmout = equivalentAmout;
    }
    
    public String getEquivalentCurrency() {
    	return equivalentCurrency;
    }
    
    public void setEquivalentCurrency(String equivalentCurrency) {
    	this.equivalentCurrency = equivalentCurrency;
    }
    
    
    public boolean isValid() {
    	return isValid;
    }
    
    public void setValid(boolean isValid) {
    	this.isValid = isValid;
    }

    ////////////////////
    // business logic computation
    // instancee method
    // -- whatever method being shared in the class will be shared by all objects

    public void compute() {
        isValid = true;
        if (targetCurrency.equalsIgnoreCase("USD")) {
            equivalentAmout = pesoAmount / 58.25;
            equivalentCurrency = "US$";
        } else if (targetCurrency.equalsIgnoreCase("EUR")) {
            equivalentAmout = pesoAmount / 64.6253;
            equivalentCurrency = "US€";
        } else if (targetCurrency.equalsIgnoreCase("JYP")) {
            equivalentAmout = pesoAmount / 0.3808;
            equivalentCurrency = "US¥";
        } else if (targetCurrency.equalsIgnoreCase("AUD")) {
            equivalentAmout = pesoAmount / 39.6529;
            equivalentCurrency = "A$";
        } else {
            System.err.println("Invalid currency. Please select valid currency.");
            isValid = false;
        }
    }
    
}
