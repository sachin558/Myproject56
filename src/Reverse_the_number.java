import java.util.Scanner;

/*
revers the number given input frpm the user
 */
public class Reverse_the_number {
    int num, rem, ans;

    Reverse_the_number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and find the reverse the number ");
        num = sc.nextInt();
    }

    void display() {
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("this is  revers number "+ans);
    }

    public static void main(String[] args) {
        Reverse_the_number obj=new Reverse_the_number();
        obj.display();
    }
}
