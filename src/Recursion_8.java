/*
Write a program to find out and return the number of digits present in a number recursively.

Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */
public class Recursion_8 {
    public static int Digits(int n){
        if(n==0){
            return 0;
        }
        return 1+Digits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(Digits(7));    }

}
