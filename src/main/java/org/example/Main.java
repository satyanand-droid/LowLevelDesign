package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    System.out.println("Hello world!");
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 11, 18, 10, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);
    }
}