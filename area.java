package com.sangamone;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.println("The area of the circle is: " + circleArea);
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                double squareArea = Math.pow(sideLength, 2);
                System.out.println("The area of the square is: " + squareArea);
                break;

            default:
                System.out.println("Invalid choice. Please choose a number from 1 to 3.");
        }

        scanner.close();
    }
}
