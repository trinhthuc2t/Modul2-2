package Quan_Ly__Thi_Sinh.Main;

import Quan_Ly__Thi_Sinh.Menu.Menu;
import Quan_Ly__Thi_Sinh.Model.Candidates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Nhập lựa chọn: \n1. Thêm\n2. Hiển thị\n3. Tìm kiếm\n0. Thoat");
            choice = inputInt.nextInt();
        switch (choice) {
                case 1:
                    menu.addStudent();
                    //menu.show();
                    break;
                case 2:
                    menu.showAll();
                    break;
                case 3:
                    menu.findById();
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        } while (choice != 0);
    }
}
