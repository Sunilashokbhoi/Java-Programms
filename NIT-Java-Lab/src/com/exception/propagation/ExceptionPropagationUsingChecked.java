package com.exception.propagation;

import java.util.Scanner;

public class ExceptionPropagationUsingChecked {
    public static void main(String[] args) {
        System.out.println("Main method is started ...");
        try {
            m1();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        System.out.println("Main is ended");
    }

    public static void m1() throws ClassNotFoundException  {
        System.out.println("m1 is started");
        m2();
        System.out.println("m1 is ended");
    }

    public static void m2() throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fully qualified class name:");
        String className = sc.next();

        // Attempt to load the class
        Class.forName(className);
        sc.close();
    }
}

class Foo {
    static {
        System.out.println("Static Block executed");
    }
}
