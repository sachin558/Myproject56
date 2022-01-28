import java.util.Scanner;

/*
1. Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81

 */
public class Recoresion_power {
   public static int  Recurion1(int x,int n) {
       if(n==0)
           return 1;
       else
           return x*Recurion1(x,n-1);
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int x=sc.nextInt();
        System.out.println("enter the power ");
        int n=sc.nextInt();
        System.out.println(Recurion1(x,n));
    }
}
