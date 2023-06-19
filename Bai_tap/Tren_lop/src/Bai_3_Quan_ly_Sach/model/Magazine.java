package Quan_ly_Sach.model;

public class Magazine extends Document {
   private String releaseNumber;
    private String releaseMonth;

    public Magazine(int id, String publishingCompany, int numberOfReleases, String releaseNumber, String releaseMonth) {
        super(id, publishingCompany, numberOfReleases);
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
