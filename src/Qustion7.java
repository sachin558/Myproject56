import java.util.Scanner;

/*
Write a program that would print the information (name, year of joining, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name yearofjoinig   Address
sunil  2000         Agra
Aman   2010         Bihar
prem   2021         phanjab
 */
public class Qustion7 {
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entr ethe name of the person ");
        String name=sc.nextLine();
        System.out.println("enter the address of the ");
        String add=sc.nextLine();
        System.out.println("enter the year of the joing");
        int year=sc.nextInt();
//        System.out.println("enter the address of the ");
//        String add=sc.nextLine();
        System.out.println("Name\t"+"yearofjoining\t\t"+"Address");
        System.out.println(name+"\t\t"+year+"\t\t"+add);
    }

    public static void main(String[] args) {
        Qustion7 obj=new Qustion7();
        obj.display();
    }
}
