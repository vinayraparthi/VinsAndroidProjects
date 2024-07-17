package com.vinay.vinsandroidprojects;

public class Project {
    String name;
    String description;
    int image;

    // R.drawable.name_of_the_file (this will be some sort of number, an "int")
    // e.g. 65683421

    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
