import java.util.Scanner;
/*
Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
 */
public class Qustion3 {
    String gender;
    int age;
    Qustion3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the gender in terms of the Female or Male ");
        gender=sc.nextLine();
        System.out.println("entre the age of the given gender ");
        age=sc.nextInt();
    }
    void display(){
        if(gender=="Female"&& age>1 && age<=58){
            System.out.println("8.2%");
        }if(gender=="Female" && age>59 && age<=100){
            System.out.println("9.2%");
        }if(gender=="Male"&& age>1 && age<=58){
            System.out.println("8.4%");
        }
    }
    public static void main(String args[]){
        Qustion3 obj=new Qustion3();
        obj.display();
    }
}

