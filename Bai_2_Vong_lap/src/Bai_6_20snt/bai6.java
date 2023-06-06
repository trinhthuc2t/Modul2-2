package Bai_6_20snt;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int countSnt = input.nextInt();
        int count = 0;
      /*  int i = 2;
        while (count <= countSnt) {
            boolean check = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(i);
                count++;
            }
            i++;
        }

*/






        for (int i = 2; count <= countSnt; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                count++;
            }
        }





    }
}
