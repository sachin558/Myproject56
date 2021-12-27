import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pettern1 {
    public static void main(String[] args) {
        System.out.println("ente teh moblie");
        Pattern p=Pattern.compile("[0-9]{10}");
       for (int i=0;i< args.length;i++){
           if(args.length==10){
               Matcher m=p.matcher(args[i]);
               if(m.find()){
                   System.out.println("number is the valed ");
                   System.out.println(m.group());
               }else System.out.println("number is the not vailed ");
           }else System.out.println("number is the not vailed ");
       }
    }
}
