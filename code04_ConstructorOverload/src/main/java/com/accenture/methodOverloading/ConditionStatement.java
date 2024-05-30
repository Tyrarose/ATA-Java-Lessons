package com.accenture.methodOverloading;

import java.util.Scanner;

public class ConditionStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("You are a minor");
        } else if (age >= 18 && age < 60){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior");
        }

    }

}
