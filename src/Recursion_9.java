import java.util.Scanner;

/*
. Write a program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */
public class Recursion_9 {
    public  static int Example_1(int arr[],int n){
        if(n<=0){
            return 0;
        }
        return Example_1(arr,n-1)+arr[n-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={9,9,8}
        System.out.println(Example_1(arr,arr.length));
    }
}
