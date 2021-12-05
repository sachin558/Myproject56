import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uptdatethequre {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo2", "root", "");
            PreparedStatement stmt = con.prepareStatement("delete from emple where id=?");
            stmt.setInt(1,89);
            stmt.executeUpdate();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
