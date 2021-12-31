import java.util.Scanner;

/*
Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power
 */
public class StaicBlock {

    static int  powerInt(int num1,int num2){
        return num1= (int )Math.pow(num1,num2);
    }
    static int powerdouble(double num1,int num2){
        return num2=(int) Math.pow((int)num1,num2);
    }

    public static void main(String[] args) {
        StaicBlock obj=new StaicBlock();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the both values for first ");
        double p=StaicBlock.powerInt(sc.nextInt(),sc.nextInt());
        System.out.println("entre the bothe values for second power  ");
        double p1=StaicBlock.powerdouble(sc.nextInt(),sc.nextInt());
        System.out.println("this is the first power of the number= "+p);
        System.out.println("this the second power of the second number= "+p1);
    }
}
