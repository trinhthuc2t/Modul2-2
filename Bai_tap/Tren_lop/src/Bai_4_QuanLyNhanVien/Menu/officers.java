package QuanLyNhanVien.Menu;

import QuanLyNhanVien.Employee_Manager.OfficersManager;
import QuanLyNhanVien.Model.Officers;

import java.util.Scanner;

public class officers {
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    public OfficersManager officersManager = new OfficersManager();

    public void showMenuAddOfficers() {
        System.out.println("-------Thêm cán bộ--------");
        System.out.println("Add name: ");
        String fullName = inputString.nextLine();
        System.out.println("Add age: ");
        int age = inputInt.nextInt();
        System.out.println("Add sex: ");
        String sex = inputString.nextLine();
        System.out.println("Add address: ");
        String address = inputString.nextLine();
        Officers officers = new Officers(fullName,age,sex,address);
        officersManager.add(officers);
        officersManager.showAll();
    }
    public void findAndDelete() {
        System.out.println("Nhập tên cần xóa: ");
        String fullName = inputString.nextLine();
        officersManager.delete(fullName);
        officersManager.showAll();
    }
    public void findAndEdit() {
        System.out.println("Nhập tên cần sửa: ");
        String fullName = inputString.nextLine();
        int index = officersManager.findIndexByFullName(fullName);
        if (index != -1) {
            Officers oldOfficers = officersManager.showAll()[index];
            System.out.println("Thông tin cán bộ cần sửa:");
            System.out.println(oldOfficers);

            System.out.println("Nhập thông tin mới:");
            System.out.println("Edit name: ");
            String newFullName = inputString.nextLine();
            System.out.println("Edit age: ");
            int newAge = inputInt.nextInt();
            System.out.println("Edit sex: ");
            String newSex = inputString.nextLine();
            System.out.println("Edit address: ");
            String newAddress = inputString.nextLine();

            Officers newOfficers = new Officers(newFullName, newAge, newSex, newAddress);
            officersManager.edit(fullName, newOfficers);
        } else {
            System.out.println("Không tìm thấy cán bộ để sửa.");
        }
        officersManager.showAll();

    }
    public void findOfficersByID(){
        System.out.println("Nhập tên cán bộ cần tìm: ");
        String fullName = inputString.nextLine();
        officersManager.findByFullName(fullName);
        officersManager.showAll();
    }
    public void showAllOfficers(){
        officersManager.showAll();
    }

}
