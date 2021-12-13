import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("(n|N)+[a-zA-Z]+");
        Matcher m=p.matcher("sachin neersf yasd ram");
        System.out.println(m.find());
        System.out.println(m.group());
    }
}
