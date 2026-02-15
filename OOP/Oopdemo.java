package OOP;

public class Oopdemo {
     public static void main(String[] args) {
       student s1=new student("ankit", 12, "tharuser@gmail.com", "a121", "at123")  ;
       System.out.println(s1.getusername());
    }
}
class user{
    String username;
    String pass;
    user(String username,String pass){
      this.username=username;
      this.pass=pass;                  //this code allow in only jdk 25,not in jdk 17
    }
    String getusername(){
 return this.username;
    }
}
class student extends user{
       String name;
       int age;
       String email;
       student(String name,int age,String email,String username,String pass){
           super(username,pass);
             this.name=name;
             this.age=age;
             this.email=email;
           
       } 
       String getname(){
        return this.name;
       }
}
