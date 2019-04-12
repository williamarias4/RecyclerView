package com.abc.recyclerview;

public class Source {
    private String title;
    private int image;
    private int state;

    public Source(String title, int image, int state) {
        this.title = title;
        this.image = image;
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
