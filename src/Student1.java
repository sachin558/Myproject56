import java.util.Scanner;

/*
. Create a class 'Student' with three data members which are name, age and address.
 The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
 It has two member methods with the same name “setInfo”. First method has two parameters for name and age and assigns
  the same whereas the second method takes three parameters which are assigned to name, age and address respectively.
  Print the name, age and address of 10 students.
 */
public class Student1 {
    String name;
    int age;
    String address;
    Student1(String name,int age,String address){
        name="unknown";
        age=0;
        address="not available";
    }
    void setinfo(String name ,int age,String address){
        System.out.println(name+"  " +age+"  "+address);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size of the array");
        int size=sc.nextInt();
        Student1 arr[]=new Student1[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("entre the name and age or address");
            arr[i]=new Student1(sc.nextLine(),sc.nextInt(),sc.nextLine());
            System.out.println(arr[i]);
        }
    }
}
