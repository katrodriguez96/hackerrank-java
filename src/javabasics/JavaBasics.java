package javabasics;
import java.io.*;
import java.util.*;

public class JavaBasics {
    public void helloWorld() {
        // Welcome to Java
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public void scanner() {
        // Java Stdin and Stdout I
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
    }

    public void ifElse() {
        // Java If-Else
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n == 2 || n == 4) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
    }

    public void scanner2() {
        // Java Stdin and Stdout II
        Scanner scanner = new Scanner(System.in);
        int myInt = Integer.parseInt(scanner.nextLine());
        double myDbl = Double.parseDouble(scanner.nextLine());
        String myString = scanner.nextLine();
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDbl);
        System.out.println("Int: " + myInt);
    }

    public void formatting() {
        // Java Output Formatting
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String [] arr1 = string1.split(" ");
        String [] arr2 = string2.split(" ");
        String [] arr3 = string3.split(" ");
        String s1 = arr1[0];
        String s2 = arr2[0];
        String s3 = arr3[0];
        int int1 = Integer.parseInt(arr1[1]);
        int int2 = Integer.parseInt(arr2[1]);
        int int3 = Integer.parseInt(arr3[1]);
        System.out.println("================================");
        System.out.printf("%-15s%03d%n", s1, int1);
        System.out.printf("%-15s%03d%n", s2, int2);
        System.out.printf("%-15s%03d%n", s3, int3);
        System.out.println("================================");
    }
}
