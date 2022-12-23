package com.CodeWallah.StudentMgmt;

public class Student {

    private int admNo;
    private String name;
    private int age;
    private int standard;

    public Student(int admNo, String name, int age, int standard) {
        this.admNo = admNo;
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
