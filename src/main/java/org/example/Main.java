package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String a = "Hello";
        String b = new String("Hello");
        String z = a.concat(b);
       // System.out.println(z);

        boolean p = a.equals(b);
        boolean c = a == b;

        System.out.println(p);
        System.out.println(c);

    }
}