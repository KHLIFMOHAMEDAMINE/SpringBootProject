package com.springbootproject.springbootproject.model;

public class Course {
    private String name;
    private String URL;
    private String description;

    public Course() {
    }

    public Course(String name, String URL, String description) {
        this.name = name;
        this.URL = URL;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
