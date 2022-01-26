import java.util.Scanner;

public class Recorrectrion_string_2 {
    String str;
    int i,count=0,re=0;
    char ch[];
    Recorrectrion_string_2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the string ");
        str=sc.nextLine();
        for (i=0;i<str.length();i++) {
            char ch = str.charAt(i);
//            System.out.println(ch);
        }
    }
    void display(){
        for (i=0;i<str.length();i++) {
            System.out.println(ch[i]+" "+i);
            if(ch[i]=='a'){
                count++;
            }else {
                re++;
            }
        }
        System.out.println("count ="+count+ " char "+ch);
        System.out.println("remaing "+re+" char" +ch);
    }

    public static void main(String[] args) {
        Recorrectrion_string_2 obj=new Recorrectrion_string_2();
        obj.display();
    }
}
