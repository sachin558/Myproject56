import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Write a regular expression to represent all names start with N|n  and ends with j|J
 */
public class Regular3 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(N|n)+[a-zA-Z]+(J|j)");
        Matcher m=p.matcher("sachin neeraj nataj kimJ NameJ");
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
