import java.util.Scanner;

/*
 Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks.
  The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;

}
// create constructor or getter and setter methods as per need
 */
public class Student_informantion{
    private String name;
    private int roll;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Student_informantion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the student ");
        name=sc.nextLine();
        System.out.println("enter the roll number of the student ");
        roll=sc.nextInt();
        System.out.println("enter the marks  of the student ");
        marks=sc.nextInt();

    }

    public static void main(String[] args) {
        int max,i,rollNo=0;
        String Name = null;
        Student_informantion arr[]=new Student_informantion[3];
        for ( i = 0; i < arr.length; i++) {
            arr[i]=new Student_informantion();
        }
        max=arr[0].marks;

        for ( i = 0; i < arr.length; i++) {
//            Name=arr[i].name;
            if(max<arr[i].marks){
                max=arr[i].marks;
                Name=arr[i].name;
                rollNo=arr[i].roll;
            }
        }
        System.out.println("highest marks "+max);
        System.out.println(Name);
        System.out.println(rollNo);
    }
}
