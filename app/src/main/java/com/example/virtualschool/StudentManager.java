package com.example.virtualschool;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;
    private static StudentManager studentManager = null;

    private StudentManager() {
        students = new ArrayList<>();
        registeredStudents();
    }

    public static void getStudentManager() {
        if (studentManager == null) {
            studentManager = new StudentManager();
        }
    }

    public void registerStudent(Student student) {
        students.add(student);
    }













    public void registeredStudents() {
        students.add(new Student("Abebe Belete", "Male", "Computer Science", R.drawable.boy));
        students.add(new Student("Blen Abera", "Female", "Health Science", R.drawable.girl));
        students.add(new Student("Chere Tesfa", "Male", "Political Science", R.drawable.boy));
        students.add(new Student("Dina Mufti", "Female", "Social Science", R.drawable.girl));
        students.add(new Student("Elsa Jusbet", "Female", "Food Science", R.drawable.girl));
        students.add(new Student("Fissha Fissha", "Male", "Engineering Science", R.drawable.boy));
        students.add(new Student("Abebe Belete", "Male", "Computer Science", R.drawable.boy));
        students.add(new Student("Blen Abera", "Female", "Health Science", R.drawable.girl));
        students.add(new Student("Chere Tesfa", "Male", "Political Science", R.drawable.boy));
        students.add(new Student("Dina Mufti", "Female", "Social Science", R.drawable.girl));
        students.add(new Student("Elsa Jusbet", "Female", "Food Science", R.drawable.girl));
        students.add(new Student("Fissha Fissha", "Male", "Engineering Science", R.drawable.boy));
    }

}

