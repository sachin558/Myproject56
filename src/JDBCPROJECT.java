import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JDBCPROJECT {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sachin-i","root","");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("entre the pattern for mathes ");
        Pattern P=Pattern.compile(s);
        System.out.println("entre the target string ");
        String target=sc.nextLine();
        Matcher M=P.matcher(target);
        int count=0;
        while (M.find()){
            System.out.println(M.start()+"   "+M.end()+"   "+M.group());
            count++;
        }
        System.out.println(count);
    }
}
