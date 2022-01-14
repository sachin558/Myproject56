import java.util.Scanner;

/*
Take the input form the user in the array form and find the sum of the odd index
 */
public class Sum_of_odd_index {
    int arr[],i,sum=0;
    Sum_of_odd_index(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        arr=new int[sc.nextInt()];
        System.out.println("enter  the element  of the array ");
        for ( i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }void display(){
        for ( i = 1; i < arr.length; i++) {
            if(i%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Sum_of_odd_index obj=new Sum_of_odd_index();
        obj.display();
    }
}
