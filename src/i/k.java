package i;

import java.util.Scanner;

public class k {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("entre the first string ");
       String A=sc.next();
        System.out.println("entre the second string ");
       String B=sc.next();
       /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=A.compareTo(B);
       if(i>0){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
       String s=A.substring(0,1).toUpperCase()+A.substring(1);
       String s1=B.substring(0,1).toUpperCase()+B.substring(1);
       System.out.println(s+" "+s1);
   }
}
