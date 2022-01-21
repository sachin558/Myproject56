import java.util.Scanner;
import java.util.logging.SocketHandler;

/*
 Write a short Java function that takes an array of int values  as an argument and determines if there is a pair of numbers in the array whose product is odd.
 */
public class ShortFuction {
    int odd_count=0,eve_count=0;
   void  Short_function(int []args,int n){
       for (int i = 0; i < args.length; i++) {
           if(args[i]%2!=0){
               if(odd_count==2){
                   System.out.println(args[i]);
               }
               odd_count++;
           }else {
               eve_count++;
           }
       }
       System.out.println(odd_count);
//       System.out.println(eve_count);
    }
    public static void main(String[] args) {
        ShortFuction obj=new ShortFuction();
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size of the program ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element of the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        obj.Short_function(arr,n);
    }

}
