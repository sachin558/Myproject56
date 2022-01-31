import java.util.Scanner;
/*
 Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2

 */
public class Arrasy2 {
    int myarr1[];
    int myarr2[];
    int count=0;
    Arrasy2(){
        Scanner sc=new Scanner(System.in);
        myarr1=new int[]{3,4,1,2,2};
        myarr2=new int[]{1,2,1,3,1};
    }
    void display(){
        for (int i = 0; i < myarr1.length; i++) {
            for (int j = 0; j < myarr2.length; j++) {

                if (myarr1[i] >= myarr2[j]) {
                    count++;
                }
                System.out.println("count " + count);
            }
        }
    }
    public static void main(String[] args) {
        Arrasy2 obj=new Arrasy2();
        obj.display();
    }
}