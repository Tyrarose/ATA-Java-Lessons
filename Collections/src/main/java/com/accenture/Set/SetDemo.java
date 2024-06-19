package com.accenture.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {


    public static void main(String[] args) {

        System.out.println();

        System.out.println("LinkedHash Set Sample");
        Set<String> places = new LinkedHashSet<>();
        places.add("1. Philippines");
        places.add("2. Japan");
        places.add("3. Saudi");
        places.add("4. Hongkong");
        places.add("5. Korea");
        places.add("6. Japan");
        System.out.println("Set of Places: " + places);

        System.out.println("Hash Set Sample");
        Set<String> countries = new HashSet<>();
        countries.addAll(places);
        System.out.println("Set of coutries: " + countries);


        System.out.println("Tree Set Sample");
        Set<String> states = new TreeSet<>();
        states.addAll(places);
        System.out.println("Set of States: " + states);

    }
}
