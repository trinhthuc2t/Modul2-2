package Bai_9_Max_in_arr;

import java.util.Arrays;
import java.util.Scanner;

public class max_arr {
    public static void main(String[] args) {
        int row, columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  rows: ");
        row = input.nextInt();
        System.out.println("Enter columns: ");
        columns = input.nextInt();
        int [][] arr = new int[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element " + " " + "arr" +"[" + i + "]"+"["+j+"]");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Arrays = ");
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
