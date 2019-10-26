package com.example.virtualschool;

public class Student {
    private String name;
    private String gender;
    private String department;
    private int imageResource;

    public Student(String name, String gender, String department, int imageResource) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.imageResource = imageResource;
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

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
