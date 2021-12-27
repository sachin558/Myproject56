import java.util.Scanner;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        Pattern p=Pattern.compile("[A-Za-z][A-Za-z0-1_.]+@gmail.com");
        Matcher m=p.matcher(str);
        if(m.find()){
            System.out.println("valid");
            System.out.println(m.group());
        }else {
            System.out.println("not ");
            System.out.println(m.group());
        }
    }
}
