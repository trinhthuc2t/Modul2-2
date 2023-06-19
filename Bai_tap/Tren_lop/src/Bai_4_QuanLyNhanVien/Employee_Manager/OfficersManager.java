package QuanLyNhanVien.Employee_Manager;

import QuanLyNhanVien.Model.Officers;

import java.util.Arrays;

public class OfficersManager implements EmployeeManager<Officers> {
    private Officers[] officers;
    public static int size = 0;

    public OfficersManager() {
        this.officers = new Officers[100];
    }

    @Override
    public void add(Officers officers) {
        this.officers[size] = officers;
        size++;
    }

    @Override
    public void delete(String fullName) {
        int index = findIndexByFullName(fullName);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                officers[i] = officers[i + 1];
            }
            officers[size - 1] = null;
            size--;
            System.out.println("Xóa cán bộ thành công.");
        } else {
            System.out.println("Không tìm thấy cán bộ để xóa.");
        }

    }

    @Override
    public void edit(String fullName, Officers officers) {
        int index = findIndexByFullName(fullName);
        if (index != -1) {
            this.officers[index] = officers;
            System.out.println("Sửa thông tin cán bộ thành công.");
        } else {
            System.out.println("Không tìm thấy cán bộ để sửa.");
        }

    }


    @Override
    public Officers findByFullName(String fullName) {
        for (int i = 0; i < size; i++) {
            if (fullName.equals(this.officers[i].getFullName())) {
                return officers[i];
            }
        }
        return null; // Trả về null nếu không tìm thấy cán bộ với tên đầy đủ đã cho
    }

    @Override
    public int findIndexByFullName(String fullName) {
        for (int i = 0; i < size; i++) {
            if (fullName.equals(this.officers[i].getFullName())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Officers[] showAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(officers[i]);
        }
        return officers;
    }


}
