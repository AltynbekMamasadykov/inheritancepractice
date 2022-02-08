package com.company;

public class Person {

    private String name;
    private String status;
    private int age;

    public Person(String name,String status,int age){
        this.name = name;
        this.status = status;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", age=" + age +
                '}';
    }
}
