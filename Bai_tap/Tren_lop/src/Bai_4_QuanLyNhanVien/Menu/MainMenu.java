package QuanLyNhanVien.Menu;


import QuanLyNhanVien.Employee_Manager.OfficersManager;

import java.util.Scanner;

public class MainMenu {
    officers officers = new officers();
    OfficersManager officersManager = new OfficersManager();

    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    public void showMainMenu() {
        String menu = "-----------Menu quản lý ---------\n1. Cán bộ.\n2. Kỹ sư.\n" +
                "3. Nhân viên.\n4. Công nhân\n0. Thoát.";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Lựa chọn của bạn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuOfficers();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại.");
            }

        } while (choice != 0);
    }

    public void showMenuOfficers() {
        String menu = "-----------Menu QL cán bộ---------\n1. Thêm.\n2. Sửa.\n" +
                "3. Tìm kiếm.\n4. Xóa\n5. Tất cả\n0 Thoát.";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Lựa chọn của bạn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    officers.showMenuAddOfficers();
                    break;
                case 2:
                    officers.findAndEdit();
                    break;
                case 3:
                    officers.findOfficersByID();
                    break;
                case 4:
                    officers.findAndDelete();
                    break;
                case 5:
                    officers.showAllOfficers();
                    break;
            }
        } while (choice != 0);
    }
}
