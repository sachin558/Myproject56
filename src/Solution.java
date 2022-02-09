import java.util.Scanner;

/*
write the program take the input from the user in the form of string find the given string is the palindrome or not
 */
public class Solution {
    String str;
    String str1="";
    Solution(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        str=sc.nextLine();
        for (int i = str.length()-1; i >=0 ; i--) {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("Yes " +str1);
        }else {
            System.out.println("not "+str1);
        }
    }

    public static void main(String[] args) {
        Solution obj=new Solution();
    }
}
