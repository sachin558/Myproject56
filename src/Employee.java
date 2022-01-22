import java.util.Scanner;

/*
Write a program to create a class (Employee) with the information given below.
1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation
Read and print the data by creating  Employee array
Hint:- aggregation / containership
 */
class address{
    int area;
    String city;
    String state;
    int salary;
    String designation;
}
public class Employee {
    int emp_id;
    String first_name;
    String last_name;
    address obj;
    Employee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the emp_id");
        emp_id=sc.nextByte();
        System.out.println("entre the first_name employee ");
        first_name=sc.next();
        System.out.println("entre the last_name of the employee ");
        last_name=sc.nextLine();
        System.out.println("entre the area of the city ");
        obj.area=sc.nextInt();
        System.out.println("entre the city of the employee ");
        obj.city=sc.next();
        System.out.println("entre the state of the employee");
        obj.state=sc.next();
        System.out.println("entre the salary of the employee ");
        obj.salary=sc.nextInt();
        System.out.println("entre the designation of the employee ");
        obj.designation=sc.next();
    }
    void display(){
        System.out.println("emp_id= "+emp_id);
        System.out.println("first_name "+first_name);
        System.out.println("last_name ="+last_name);
        System.out.println("area "+obj.area);
        System.out.println("city "+ obj.city);
        System.out.println("state "+obj.state );
        System.out.println("salary "+obj.salary);
        System.out.println("designation "+obj.designation);
    }
    public static void main(String[] args) {
        Employee obj[]=new Employee[1];
        for (int i = 0; i <obj.length ; i++) {
            obj[i]=new Employee();
        }
    }
}
