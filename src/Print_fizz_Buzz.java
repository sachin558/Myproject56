import java.util.Scanner;

/*
print all the number from the 1 to 15 following some condition
1 if the number is the divisibale by 3 then print "Fizz"
2 if the numbr is the divisibale by the 5 then print "Buzz"
3 if the number is the divisibale by the bothe value 3 and 5 then print "FizzBuzz"
 */
public class Print_fizz_Buzz {
    public static void main(String[] args) {
        for (int i = 1; i <=15 ; i++) {
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz "+i);
            }if(i%3==0){
                System.out.println("Fizz "+i);
            }if(i%5==0){
                System.out.println("Buzz "+i);
            }
        }
    }
}
