package Bai_3_NumberFormatException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        try {
            System.out.println("Nhập x:");
            x = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập y: ");
            y = Integer.parseInt(scanner.nextLine());
            CalculationExample calculationExample = new CalculationExample();
            calculationExample.calc(x, y);
        } catch (NumberFormatException e) {
            System.out.println("Nhập số");
        } catch (Exception e){
            System.err.println("Xảy ra ngoại lệ: b = 0");
        }

    }
}
