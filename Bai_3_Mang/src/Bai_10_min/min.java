package Bai_10_min;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhâp độ dài mảng: ");
        size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử mảng:");
            arr[i] = input.nextInt();
        }
        System.out.println("Min của mảng: ");
        System.out.println(minArr(arr));
    }

    public static int minArr (int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
