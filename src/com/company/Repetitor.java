package com.company;

import java.util.Scanner;

public class Repetitor extends Person{

    public Repetitor(String name, String status, int age) {
        super(name, status, age);
    }

    public void setPoints(Student student, Task task){
        Scanner scanner = new Scanner(System.in);
        if(task.isDone()==true) {
            System.out.println("bal beriniz");

            int bal = scanner.nextInt();
            task.setChecked(true);
            task.setPointForIt(bal);


            switch (bal) {
                case 2:
                    System.out.println("eki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("tort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
            }

            int totalbal = student.getAllPoints();
            totalbal += bal;
            student.setAllPoints(totalbal);
        }
            else{
            System.out.println("buto elek");
        }
    }
}

