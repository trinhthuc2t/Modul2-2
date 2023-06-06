package Bai_2_UDtinhtienlai;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = input.nextInt();
        System.out.println("Nhập lãi: ");
        interestRate = input.nextDouble();
        double totalInterrest = 0;
        for (int i = 0; i < month; i++){
            totalInterrest += money*(interestRate/100)/12*month;
        }
        System.out.println(totalInterrest);
    }
}
