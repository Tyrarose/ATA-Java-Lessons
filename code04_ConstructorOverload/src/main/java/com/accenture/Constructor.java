package com.accenture;

public class Constructor {

    // public, private, protected and default
    private String title;
    private String author;
    private double price;



//    public Constructor(String title, String author, double price) { // defaulted by intellij
    // default constructor
    public Constructor() {
        this.title = "title";
        this.author = "author";
        this.price = 0.0;
    }

    // parameterized constructor
    public Constructor(String title){
        this.title = title;
        this.author = "Unknown author";
        this.price = 0.0;
    }
    public Constructor(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    public Constructor(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }



    public void displayDetails(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }




}
