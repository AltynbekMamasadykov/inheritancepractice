package com.company;

public class Task {
    private String name;
    private int pointForIt;
    private boolean done;
    private boolean checked;
    private Student student;


    public Task(String name,Student student,boolean done){
        this.name = name;
        this.student = student;
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointForIt() {
        return pointForIt;
    }

    public void setPointForIt(int pointForIt) {
        this.pointForIt = pointForIt;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void taskInfo(){
        System.out.println(getName()+getStudent()+getPointForIt()+isDone()+isChecked());
    }



}
