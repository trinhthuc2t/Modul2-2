package Quan_ly_Sach.model;

public class Book extends Document {
    private String name;
    private int numberOfPages;

    public Book(int id, String publishingCompany, int numberOfReleases, String name, int numberOfPages) {
        super(id, publishingCompany, numberOfReleases);
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
