package com.accenture.List;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rona");
        names.add("Aeron");
        names.add("Agnes");
        names.add("Albin");
        names.add("Allen");
        names.add("Agnes");

        System.out.println("List of Names: " + names);
        System.out.println("Get Rona on the list: " + names.get(0));


        System.out.println("Remove Agnes from the list: " + names.remove(2));
        System.out.println("List of Names: " + names);

        Collections.reverse(names);
        System.out.println("Reversed Names: " + names);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Rona", "hello@email.com"));
        employees.add(new Employee(2, "Tyra", "tyra@email.com"));

        System.out.println("List of Employee: " + employees);


        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Lemon");
        fruits.add("Pineapple");
        fruits.add("Mango");

        System.out.println("List of fruits: "+ fruits);

        fruits.pop();
        System.out.println("List of fruits after pop: "+ fruits);

        fruits.push("Strawberry");
        System.out.println("List of fruits after push: "+ fruits);


        System.out.println("Peek: "+ fruits.peek());

    }

}
