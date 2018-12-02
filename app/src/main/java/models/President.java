package models;

public class President {

     int image;
     String name, duration;

    public President() {}

    public President(int image, String name, String duration) {
        this.image = image;
        this.name = name;
        this.duration = duration;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
