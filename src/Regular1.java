/*
Write a regular expression to represent all names start with N | n  with any length
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the name of the presion and Name should strat with N or n");
        String Str=sc.nextLine();
        String str[]=Str.split(" ");
        int i=0;
        while (i<str.length){
            if(str[i].matches("(n|N)[a-zA-Z]+"))
            System.out.println(str[i]);
            i++;
        }
    }
}
