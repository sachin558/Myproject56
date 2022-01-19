import java.util.Scanner;
/*
write the program to the find the target values in the Two array ;
 */
public class Two_D_Array {
    int arr[][],i,j,sum=0;
    Two_D_Array(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size of the array and columns size of the  ");
        arr=new int[sc.nextInt()][sc.nextInt()];
        System.out.println("enter the element of the array ");
        for (i= 0; i <arr.length ; i++) {
            for (j = 0;  j< arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        for (i= 0; i <arr.length ; i++) {
            for (j = 0;  j< arr.length; j++) {
                sum+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Two_D_Array obj=new Two_D_Array();
        obj.display();
    }
}
