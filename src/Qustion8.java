import java.util.Scanner;

/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with two instance variables, length and breadth and a
 method named 'Area' which returns the area. Initialise the object attributes by taking
  the input from the user in the constructor

 */
public class Qustion8 {
    int lenght,breadh,Area;
    Qustion8(){
        Scanner obj=new Scanner(System.in);
        System.out.println("entre the lenght of thje rectangle");
        lenght=obj.nextInt();
        System.out.println("entre  the breadth of the rectangle");
        breadh=obj.nextInt();
    }
    int Area(){
        return Area=lenght*breadh;
    }

    public static void main(String[] args) {
        Qustion8 obj1=new Qustion8();
        System.out.println(obj1.Area());
    }
}
