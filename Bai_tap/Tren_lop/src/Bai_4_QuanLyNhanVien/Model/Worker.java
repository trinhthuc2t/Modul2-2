package QuanLyNhanVien.Model;

public class Worker extends Officers {
    private String grade;

    public Worker(String fullName, int age, String sex, String address, String grade) {
        super(fullName, age, sex, address);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
