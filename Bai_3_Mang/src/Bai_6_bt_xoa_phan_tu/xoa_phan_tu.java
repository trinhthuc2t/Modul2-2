package Bai_6_bt_xoa_phan_tu;

import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] a) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = input.nextInt();
        int index_del = -1;

/*
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]){

            }

        }*/


        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index_del = i;
                break;
            }
        }

        for (int i = index_del; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(Arrays.toString(arr));

    }
}
