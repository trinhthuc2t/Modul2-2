package QuanLyNhanVien.Employee_Manager;

import QuanLyNhanVien.Model.Engineer;

public class EngineerManager implements EmployeeManager<Engineer> {

    @Override
    public void add(Engineer engineer) {


    }

    @Override
    public void delete(String fullName) {

    }

    @Override
    public void edit(String fullName, Engineer engineer) {

    }

    @Override
    public Engineer findByFullName(String fullNam) {
        return null;
    }

    @Override
    public int findIndexByFullName(String fullName) {
        return 0;
    }

    @Override
    public Engineer[] showAll() {
        return new Engineer[0];
    }
}