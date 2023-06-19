package QuanLyNhanVien.Model;

public class Staff extends Officers{
    private String job;

    public Staff(String fullName, int age, String sex, String address, String job) {
        super(fullName, age, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
