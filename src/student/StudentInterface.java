/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);
        Student highestAverage, highestScore;
        String name;
        int score;

        while(true) {
            System.out.print("Enter name for first student (min 1 letter): ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter score %d for %s> ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if(errormsg == null) {
                break;
            }else{
                System.out.println(errormsg);
                scan.nextLine();
            }
        }
        
        scan.nextLine();
        System.out.println("\n===========================\n");

        while(true) {
            System.out.print("Enter name for second student (min 1 letter): ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter score %d for %s> ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if(errormsg == null) {
                break;
            }else{
                System.out.println(errormsg);
                scan.next();
            }
        }
        scan.nextLine();
        System.out.println("\n===========================\n");

        highestAverage = stu1.getAverage() > stu2.getAverage() ? stu1 : stu2;
        highestScore = stu1.getHighest() > stu2.getHighest() ? stu1 : stu2;
        System.out.println("Highest Average: " + highestAverage.getName() + " with " + highestAverage.getAverage());
        System.out.println("Highest Score: " + highestScore.getName()+ " with " + highestAverage.getHighest());
    }
}
