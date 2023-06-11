package Bai_7_them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class add_element {
    public static void main(String[] args) {
        int [] arr = {10,4,6,7,8,0,0,0,0,0};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter element: ");
        int element = input.nextInt();
        System.out.println("Enter index:");
        int index = input.nextInt();
        if (index <= -1 && index > arr.length) {
            System.out.println("Không chèn thêm phần tử vào mảng");

        }else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = element;
        }
        System.out.println(Arrays.toString(arr));
    }
}
