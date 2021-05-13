package com.company.assignment6;

public class ConstructorOverloadingExample {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private int id;
    private String name;
    private String department;
    ConstructorOverloadingExample(int id,String name){
        this.id=id;
        this.name=name;
    }
    ConstructorOverloadingExample(int id,String name,String department){
        this(id,name);
        this.department=department;
    }
}
