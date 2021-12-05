import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Scanner sc=new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo2", "root", "");
            PreparedStatement stmt = con.prepareStatement("delete from emple where id=?");
            System.out.println("entre the name of the employee");
            stmt.setString(1, sc.nextLine());
            System.out.println("entre the id of the employee");
            stmt.setInt(1, sc.nextInt());
            stmt.execute();
//            System.out.println(i);
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
