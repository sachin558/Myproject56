import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array. 
Note:-  Resulting arrays will be of ArrayList type
 */
public class Two_D_Array {
    int marks[][],i,j,values,c,d;
    Two_D_Array(){
        Scanner sc=new Scanner(System.in );
        System.out.println("enter  the size of the array");
        marks=new int[sc.nextInt()][sc.nextInt()];
        System.out.println("enter the target value");
        values=sc.nextInt();
        System.out.println("enter the element  of the array ");
        for ( i = 0; i < marks.length; i++) {
            for (j= 0; j < marks.length; j++) {
                marks[i][j]=sc.nextInt();
            }
        }
    }void display(){
        for (i = 0;  i< marks.length; i++) {
            for (j= 0; j< marks[i].length; j++) {
                if(marks[i][j]%2==0){
                    System.out.print(marks[i][j]+" ");
                    c++;
                }else {
                    System.out.println("this the odd number  "+marks[i][j]+"");
                    d++;
                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("this is total number tof the even number "+c+" and this is total number of the odd number "+d);
    }
    public static void main(String[] args) {
        Two_D_Array obj=new Two_D_Array();
        ArrayList<Two_D_Array> obj1=new ArrayList<>();
    }

}
