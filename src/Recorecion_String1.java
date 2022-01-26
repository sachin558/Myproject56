import java.util.Scanner;

public class Recorecion_String1 {
    String str;
    Recorecion_String1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the string ");
        str=sc.nextLine();
    }
    void display(){
       char ch=str.charAt(2);
        System.out.println(ch);
    }
    public static void main(String[] args) {
        Recorecion_String1 obj=new Recorecion_String1();
        obj.display();
    }
}
