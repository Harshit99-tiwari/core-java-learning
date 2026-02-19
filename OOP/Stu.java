package OOP;

public class Stu {
    public static void main(String[] args) {
        student s1 = new student(121, "harsh");
        student s2 = new student(131, "ansh");
        student s3 = new student(141, "harshit");
        student allstudent[] = { s1, s2, s3 };
        for (student onestudent : allstudent) {
            System.out.println(onestudent.roll + " , " + onestudent.name);
        }
        s1.friend = s2;
        s2.friend = s3;
        System.out.println(s1.friend.friend.name);
    }
}

class student {
    int roll;
    String name;
    student friend;

    student(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }
}
