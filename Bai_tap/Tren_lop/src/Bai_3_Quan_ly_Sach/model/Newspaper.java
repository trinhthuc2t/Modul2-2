package Quan_ly_Sach.model;

public class Newspaper extends Document {
   private String releaseDate;

    public Newspaper(int id, String publishingCompany, int numberOfReleases, String releaseDate) {
        super(id, publishingCompany, numberOfReleases);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
