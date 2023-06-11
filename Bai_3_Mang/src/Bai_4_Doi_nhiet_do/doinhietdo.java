package Bai_4_Doi_nhiet_do;

import java.util.Scanner;

public class doinhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int a = -1;

        do {
            System.out.println("Menu");
            System.out.printf("%-5s%s", "", "1. Fahrenheit to Celsius\n");
            System.out.printf("%-5s%s", "", "2. Celsius to Fahrenheit\n");
            System.out.printf("%-5s%s", "", "0. Exit\n");

            System.out.println("Enter your choice: ");
            a = input.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    break;
            }
        } while (a != 0);

    }

    public static double celsiusToFahrenheit(double celsius) {
        return  (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}
