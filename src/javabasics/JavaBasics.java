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
}
