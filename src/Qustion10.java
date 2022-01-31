/*
Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
 otherwise the name should be equal to the String value passed while creating object of Student class.
 */
public class Qustion10 {
    String name;
    String ss;
   Qustion10(String ss){
       name=ss;
   }Qustion10(){
       name="unknown";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Qustion10 sc=new Qustion10();
        System.out.println(sc.name);
        System.out.println(sc.ss);
    }
}
