package Bai_5_Min_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        int size = -1;
        Scanner input = new Scanner(System.in);
        while (size != 0) {
            do {
                System.out.println("Enter a size: ");
                size = input.nextInt();
                if (size > 20) System.out.println("Size lớn hơn 20");
            } while (size > 20);
            if (size == 0) break;
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element " + (i + 1) + ":");
                arr[i] = input.nextInt();
            }
            System.out.println("arr = " + Arrays.toString(arr));
            minArr(arr);
        }
    }

    public static int minArr(int[] arr) {
        int min = arr[0];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index++;
            }
            System.out.println(min + " là số nhỏ nhất mảng arr " + "tại vị trí thứ " + index);
        }
        return min;
    }
}
