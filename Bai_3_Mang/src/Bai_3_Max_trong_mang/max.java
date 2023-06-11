package Bai_3_Max_trong_mang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        }while ( size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i+1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if ( array[j] > max) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("Max = " + max + " tại vị trí " + index);
    }
}
