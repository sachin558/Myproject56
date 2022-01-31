package sachin;

import java.util.Scanner;

public class String_present_or_not {
    int flag=1;
    String str1,str2;
    String_present_or_not(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first string ");
        str1=sc.nextLine();
        System.out.println("entre the second string ");
        str2=sc.nextLine();
    }
      void display(){
        for (char i = 'a'; i <'z' ; i++) {
             String s=Character.toString(i);
             if(str1.contains(str2)==false){
                 flag=0;
                 break;
             }
        }if(flag==0){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        String_present_or_not obj=new String_present_or_not();
        obj.display();
    }
}
