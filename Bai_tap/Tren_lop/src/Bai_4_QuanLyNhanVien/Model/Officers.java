package QuanLyNhanVien.Model;

public class Officers {
    private String fullName;
    private int age;
    private String sex;
    private String address;
    public Officers(){

    }
    public Officers(String fullName, int age, String sex, String address) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
