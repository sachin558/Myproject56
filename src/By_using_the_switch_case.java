import java.util.Scanner;
/*
By using the switch case in the   program
 */
public class By_using_the_switch_case {
     int num,num1,i=2,count=0;
    By_using_the_switch_case() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the test case ");
        num = sc.nextInt();
        System.out.println("entre the number check the given number is the prime ");
        num1= sc.nextInt();
    }
    void dispalay() {
        switch (num) {
            case 1:
                while (i < num1 / 2) {
                    if (num / i == 0) {
                        count++;
                        break;
                    }
                    i++;
                }
                if (count == 0) {
                    System.out.println("this is the prime number " + num1);
                } else {
                    System.out.println("not prime number " + num1);
                }
            case 2:
                if (num1 % 2 == 0) {
                    System.out.println("this is the even number " + num1);
                } else {
                    System.out.println("this is the odd number" + num1);
                }
        }
        System.out.println("this the invalid case "+num);
    }
    public static void main(String[] args) {
        By_using_the_switch_case obj=new By_using_the_switch_case();
        obj.dispalay();
    }
}
