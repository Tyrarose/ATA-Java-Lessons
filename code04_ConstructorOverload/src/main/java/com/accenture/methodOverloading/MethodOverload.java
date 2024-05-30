package com.accenture.methodOverloading;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("Volume of a cube: " + volume(5));
        System.out.println("Volume of a rectangle: " + volume(5,6,7));
        System.out.println("Volume of a something: " + volume(5.0,6,7));

    }


    // volume of a cube
    private static int volume (int a){
        return a*a*a;
    }

    // volume of a rectangle
    private static int volume(int a, int b, int c){
        return a*b*c;
    }

//    private static double volume(int a, int b, int c){
// error same params idk but different return type AAAAHHH sAME PARAM

    // volume of something
    private static double volume(double a, int b, int c){
        return (a*b*c)/3;
    }
}
