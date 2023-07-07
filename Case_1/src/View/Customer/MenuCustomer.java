package View;

import Model.File.Input;

import Model.User.StaticUser;
import View.admin.MenuAdm;

public class MenuCustomer {
   private MenuAdm menuAdm = new MenuAdm();
    public void showMenuCustomer() {
        String menu = "-------Khách Hàng-------\n" +
                "1. Danh sách xe\n" +
                "2. Thông tin cá nhân\n" +
                "3. Xe đã thuê\n" +
                "4. Trả xe\n"+
                "0. Đăng xuất";

        int choice;
        do {
            System.out.println(menu);
            choice = Input.inputInteger();
            switch (choice) {
                case 1:
                    showListVehicle();
                    break;
                case 2:
                    showMenuUser();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }
    public void showListVehicle(){
        String menu = "-------Danh sách xe-------\n" +
                "1. Xe máy\n" +
                "2. Ô tô\n" +
                "3. Xe tải\n" +
                "4. Container\n" +
                "0. Quay lại";

        int choice;
        do {
            System.out.println(menu);
            choice = Input.inputInteger();
            switch (choice) {
                case 1:
                    menuAdm.showMotorbike();
                    break;
                case 2:
                    menuAdm.showCar();
                    break;
                case 3:
                    menuAdm.showTruck();
                    break;
                case 4:
                    menuAdm.showContainer();
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    } public void showMenuUser(){
        String menu = "-------Thông tin-------\n" +
                "1. Thông tin cá nhân\n" +
                "2. Sửa thông tin\n" +
                "3. Đổi mật khẩu\n" +
                "0. Quay lại";

        int choice;
        do {
            System.out.println(menu);
            choice = Input.inputInteger();
            switch (choice) {
                case 1:
                    showUser();
                    break;
                case 2:
                    editUser();
                    break;
                case 3:
                    changePassword();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }


    public void editUser() {
        System.out.println("Họ và tên:");
        String fullName = Input.inputString();
        StaticUser.user.setUserName(fullName);
        System.out.println("Tuổi: ");
        int age = Input.inputInteger();
        StaticUser.user.setAge(age);
        System.out.println("Số điện thoại");
        int phoneNumber = Input.inputInteger();
        StaticUser.user.setPhoneNumber(phoneNumber);
        System.out.println("Địa chỉ: ");
        String address = Input.inputString();
        StaticUser.user.setAddress(address);
    }
    public void showUser(){
        String user = "Họ tên - " + StaticUser.user.getFullName() + ", Tuổi - " + StaticUser.user.getAge() + ", SĐT - " +
                StaticUser.user.getPhoneNumber() + ", Địa chỉ - " + StaticUser.user.getAddress();
        System.out.println(user);
    }
   public void changePassword(){
       System.out.println("Nhập mật khẩu hiện tại:");
       String pass = Input.inputString();
       if (pass.equals(StaticUser.user.getPassWord())){
           System.out.println("Nhập mật khẩu mới: ");
           String newPassWord = Input.inputString();
           StaticUser.user.setPassWord(newPassWord);
           System.out.println("Đổi mật khẩu thành công!");
       }else System.out.println("Mật khẩu hiện tại không chính xác. Thay đổi mật khẩu thất bại!");
   }
}
