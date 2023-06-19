package QuanLyNhanVien.Employee_Manager;

import QuanLyNhanVien.Model.Engineer;

public interface EmployeeManager<E>{
    void add(E e);
    void delete(String fullName);
    void edit(String fullName, E e);
     E findByFullName (String fullNam);
    int findIndexByFullName(String fullName);
    E[] showAll();

}
