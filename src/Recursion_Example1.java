import java.awt.*;
import java.util.Scanner;
//write the program to print the number r1 to 5 by using the recursion concept
public class Recursion_Example1 {
    static  void display(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        display(n+1);
    }

    public static void main(String[] args) {
        display(1);
    }
}
