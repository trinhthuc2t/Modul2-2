package QuanLyNhanVien.Employee_Manager;

import QuanLyNhanVien.Model.Engineer;
import QuanLyNhanVien.Model.Worker;

public class WorkerManager implements EmployeeManager<Worker>{

    @Override
    public void add(Worker worker) {

    }

    @Override
    public void delete(String fullName) {

    }

    @Override
    public void edit(String fullName, Worker worker) {

    }

    @Override
    public Worker findByFullName(String fullNam) {
        return null;
    }

    @Override
    public int findIndexByFullName(String fullName) {
        return 0;
    }

    @Override
    public Worker[] showAll() {
        return new Worker[0];
    }
}
