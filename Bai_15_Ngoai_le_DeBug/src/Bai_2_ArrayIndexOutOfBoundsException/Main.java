package Bai_2_ArrayIndexOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        try{
            int x = scanner.nextInt();
            System.out.println("Giá trị của phần tử thứ " + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }catch (InputMismatchException e) {
            System.out.println("Nhập số");
        }
    }
}
