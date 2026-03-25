package Staticandfinal;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}

class Student {
    private String rollno;
    private static int count = 1;

    private String assignRollNo() {
        Date d = new Date();
        String rn = "rgpv-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    public Student() {
        rollno = assignRollNo();
    }

    public String getRollNo() {
        return rollno;
    }
}
