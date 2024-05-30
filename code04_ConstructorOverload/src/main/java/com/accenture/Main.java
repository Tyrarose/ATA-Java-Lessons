package com.accenture;

public class Main {

    public static void main(String[] args) {

        Constructor book1 = new Constructor();
        Constructor book2 = new Constructor("Crazy Rich Asians");
        Constructor book3 = new Constructor("Milk and honey", "Rupi Kaur");
        Constructor book4 = new Constructor("All the Bright Places", "Niven, Jennifer", 235.0);

        System.out.println("Book 1 Details");
        book1.displayDetails();

        System.out.println("\nBook 2 Details");
        book2.displayDetails();

        System.out.println("\nBook 3 Details");
        book3.displayDetails();

        System.out.println("\nBook 4 Details");
        book4.displayDetails();



    }
}