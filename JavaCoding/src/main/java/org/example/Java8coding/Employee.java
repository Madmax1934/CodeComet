package org.example.Java8coding;

public class Employee {
    private String name;
    private int age;
    private String gender;

    private String dept;

    public Employee(String name, int age, String gender, String dept) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
