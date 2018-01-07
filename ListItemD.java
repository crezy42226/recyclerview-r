package com.alshahri.crezy.recyclerviewtest;

/**
 * Created by crezy on 1/7/2018.
 */

public class ListItemD {
    int Images;
    String name;
    String Des;


    public ListItemD() {
    }

    public ListItemD(int images, String name, String des) {
        Images = images;
        this.name = name;
        Des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }
}
