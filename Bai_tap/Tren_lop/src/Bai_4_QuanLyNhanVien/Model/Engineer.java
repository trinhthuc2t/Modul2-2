package QuanLyNhanVien.Model;

public class Engineer extends Officers {
    private String trainingIndustry;

    public Engineer(String fullName, int age, String sex, String address, String trainingIndustry) {
        super(fullName, age, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}
