package com.example.virtualschool;

public class Student {
    private String name;
    private String gender;
    private String department;
    private String imageURL;

    public Student(String name, String gender, String department, String imageURL) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
