import java.util.Scanner;

/*
write the program to print the String by using the Substring method
 */
public class Recursion_Example_3 {
    String str;
    Recursion_Example_3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the string ");
        str=sc.nextLine();
    }
    void display(){
        System.out.println(str.substring(3,5));
        System.out.println(str.substring(1,6));
    }

    public static void main(String[] args) {
        Recursion_Example_3 obj=new Recursion_Example_3();
        obj.display();
    }
}
