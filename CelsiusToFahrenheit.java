package com.sangamone;
import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);

        // Display the result
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Function to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
