package Bai_2_Tim_gia_tri_trong_mang;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String[] students = {"Minh", "Nguyên", "Hảo", "Việt Anh", "Khanh", "Quang", "Hải", "Sơn", "Bách", "Hiếu"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
