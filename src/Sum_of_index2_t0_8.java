import java.util.Scanner;

/*
Take the input form the user in the array form and find the sum of the index greater then 2 and less then 8
 */
public class Sum_of_index2_t0_8 {
    int arr[],i,sum=0;
    Sum_of_index2_t0_8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        arr=new int[sc.nextInt()];
        System.out.println("enter  the element  of the array ");
        for ( i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }void display(){
        for ( i = 0; i < arr.length; i++) {
            if(i>2&&i<8){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Sum_of_index2_t0_8 obj=new Sum_of_index2_t0_8();
        obj.display();
    }
}
