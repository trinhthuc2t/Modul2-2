package QuanLyNhanVien.Employee_Manager;

import QuanLyNhanVien.Model.Staff;

public class StaffManger implements EmployeeManager<Staff> {

    @Override
    public void add(Staff staff) {

    }

    @Override
    public void delete(String fullName) {

    }

    @Override
    public void edit(String fullName, Staff staff) {

    }

    @Override
    public Staff findByFullName(String fullNam) {
        return null;
    }

    @Override
    public int findIndexByFullName(String fullName) {
        return 0;
    }

    @Override
    public Staff[] showAll() {
        return new Staff[0];
    }
}
