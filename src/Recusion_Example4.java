/*
 Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
public class Recusion_Example4 {
    public static void  Recursion7(int n){
        if (n==6){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Recursion7(n+1);
    }

    public static void main(String[] args) {
            Recursion7(1);
    }
}

