import java.util.Scanner;

public class Find_sum_of_odd_idex_number {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the element ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of the array ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i <arr.length; i+=2) {
            sum+=arr[i];
        }
        System.out.println("this is the sum of the odd index value= "+sum);
    }
}
