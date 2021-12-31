import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mohit1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jc.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","");
        PreparedStatement s=con.prepareStatement("insert into mohit values ");
        s.setString(1,"sachin");
        s.setInt(2,90);
        s.executeUpdate();
        con.close();
    }
}
