package com.company;

public class Main {

    public static void main(String[] args) {
    Student student = new Student("aza","online",18,"infak");
        System.out.println(student);

        Task task = new Task("inheritance",student,true);
        Task task2  = new Task("lyuboy",student,true);
        Repetitor repetitor = new Repetitor("John","online",18);
        repetitor.setPoints(student,task);
        repetitor.setPoints(student,task2);
        student.studentInfo();


    }


}
