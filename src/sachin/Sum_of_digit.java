package sachin;
/*
write the program to find out the sum of the digits
 */
public class Sum_of_digit {
    public static int  sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
}
