package com.example.customlistview;

public class Person {
    int Image;
    String Name;

    public Person(int img, String name) {
        Image = img;
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
