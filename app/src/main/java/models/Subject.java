package models;

public class Subject {
    private String title;
    private String author;
    private String detail;
    private String referenceLink;
    private int image;

    public Subject(String title, String author, String detail, String referenceLink, int image) {
        this.title = title;
        this.author = author;
        this.detail = detail;
        this.referenceLink = referenceLink;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
