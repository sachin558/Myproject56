import java.util.Arrays;
import java.util.Scanner;

/*Take the two input from the user in the form string check the anagram
 */
public class Check_anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first string ");
        String str1=sc.nextLine();
        System.out.println("entre the second string");
        String str2=sc.nextLine();
        char[] c=str1.toCharArray();
        char []c1=str2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(Arrays.equals(c,c1)){
            System.out.println("this is the anagram");
        }else {
            System.out.println("not anagram");
        }
    }
}
