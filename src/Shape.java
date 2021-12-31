import java.util.Scanner;

/*
Write a program to create a class named shape. It should contain 2 methods, draw() and erase()
that prints “Drawing Shape” and “Erasing Shape” respectively.
 */
public class Shape {
    String str,str1;
    Shape() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        str=sc.nextLine();
        System.out.println("entre the second number ");
        str1=sc.nextLine();
    }
    void draw(){
        System.out.println("this is the given "+str);
    }
    void erase(){
        System.out.println("this the second string "+str1);
    }
    public static void main(String args[]){
        Shape obj1=new Shape();
        obj1.draw();
        obj1.erase();
    }
}
