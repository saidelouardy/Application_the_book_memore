package com.example.firstprojet.food;

public class datafood {

    private String titlefood;
    private int imagefood;
    private int desfood;

    public datafood(String titlefood, int imagefood , int desfood ) {
        this.titlefood = titlefood;
        this.imagefood = imagefood;
        this.desfood =desfood;
    }

    public String getTitlefood() {
        return titlefood;
    }

    public void setTitlefood(String titlefood) {
        this.titlefood = titlefood;
    }

    public int getImagefood() {
        return imagefood;
    }

    public void setImagefood(int imagefood) {
        this.imagefood = imagefood;
    }

    public int getDesfood() {
        return desfood;
    }

    public void setDesfood(int desfood) {
        this.desfood = desfood;
    }
}
