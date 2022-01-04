import java.util.Scanner;
/*
Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
 */
public class Qustion9 {
    int salary,hours;
    Qustion9(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary");
        salary=sc.nextInt();
        System.out.println("entre the hours in the day ");
        hours=sc.nextInt();
    }
    void getinfo(){
        System.out.println("this isn the intial salaray of the employee "+salary+" number iof the hours in the day for worke= "+hours);
    }
    void Addsal(){
        if(salary<=500){
            salary+=10;
            System.out.println("this the salary greater the 500 = "+salary);
        }
    }
    void Addwork(){
        if(hours>6){
            salary+=5;
            System.out.println("this is the saalray of the work  hours greater then 6 = "+salary);
        }
    }
    public static void main(String[] args) {
        Qustion9 obj=new Qustion9();
        obj.getinfo();
        obj.Addsal();
        obj.Addwork();
    }
}

