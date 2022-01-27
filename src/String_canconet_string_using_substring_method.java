import java.util.Scanner;

/*
write the program to print the string by using the substring method  and concatenation
example  input sachin
// output sachn
 */
public class String_canconet_string_using_substring_method {
    String str;
    String_canconet_string_using_substring_method(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        str=sc.nextLine();
    }
    void display(){
       String res=str.substring(0,4)+str.substring(4+1);
        System.out.println(res);
    }

    public static void main(String[] args) {
        String_canconet_string_using_substring_method obj=new String_canconet_string_using_substring_method();
        obj.display();
    }
}
