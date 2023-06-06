package Bai_5_bt_hienthihinh;

import javax.swing.*;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.printf("%-5s%s", "", "1:Print the rectangle\n");
            System.out.printf("%-5s%s", "", "2:Print the square triangle\n");
            System.out.printf("%-5s%s", "", "3:Print isosceles triangle\n");
            System.out.printf("%-5s%s", "", "4:Exit\n");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.printf("%-3s", "*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.printf("%-3s", "*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.printf("%-3s", "*");
                        }
                        System.out.println("*");
                    }
                    break;
            }
        }
    }
}

