package Bai_1_SNT;

import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải SNT");
        }else {
            int i = 2;
            boolean check = true;
            while ( i < Math.sqrt(number) ) {
                if (number % i == 0){
                    check = false;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " là SNT");
            }else {
                System.out.println(number + " không phải SNT");
            }
        }
    }
}
