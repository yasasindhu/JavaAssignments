package com.company.assignment12;

public class Student {
    public int id;

    public String getName() {
        return name;
    }

    public void setPerTillDate(double perTillDate) {
        this.perTillDate = perTillDate;
    }

    public int getId() {
        return id;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public String name;
    public int age;
    public String gender;
    public String engDepartment;
    public int yearOfEnrollment ;
    public double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }

    public int getAge() {
        return age;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public String getGender() {
        return gender;
    }
}
