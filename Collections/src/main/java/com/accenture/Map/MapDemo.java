package com.accenture.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> foodMenu = new LinkedHashMap<>();
        foodMenu.put("Burger", 100);
        foodMenu.put("Pizza", 150);
        foodMenu.put("Pasta", 200);
        foodMenu.put("Pizza", 100);
        foodMenu.put("Water", 25);
        foodMenu.put("Cake", 150);

        System.out.println("Food Menu for Today! ");
        System.out.println(foodMenu);


        System.out.println("Hash Map Sample");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.putAll(foodMenu);
        System.out.println(hashMap);

        System.out.println("Tree Map Sample");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(foodMenu);
        System.out.println(treeMap);

    }
}
