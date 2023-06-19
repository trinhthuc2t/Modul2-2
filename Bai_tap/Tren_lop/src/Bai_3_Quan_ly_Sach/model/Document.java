package Quan_ly_Sach.model;

public class Document {
    private int id;
    private String publishingCompany;
    private int numberOfReleases;

    public Document(int id, String publishingCompany, int numberOfReleases) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.numberOfReleases = numberOfReleases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getNumberOfReleases() {
        return numberOfReleases;
    }

    public void setNumberOfReleases(int numberOfReleases) {
        this.numberOfReleases = numberOfReleases;
    }
}
