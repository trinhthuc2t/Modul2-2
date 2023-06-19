package Quan_Ly__Thi_Sinh.Model;


public class Candidates {
    private int id;
    private String fulName;
    private String address;
    private String priorityLevel;
    private String khoiThi;

    public Candidates(int id, String fulName, String address, String priorityLevel, String khoiThi) {
        this.id = id;
        this.fulName = fulName;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.khoiThi = khoiThi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "\nCandidates{" +
                "id=" + id +
                ", fulName='" + fulName + '\'' +
                ", address='" + address + '\'' +
                ", Priority='" + priorityLevel + '\'' +
                ", khoiThi='" + khoiThi + '\'' +
                '}';
    }
}
