import javax.sql.DataSource;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mytable";
        String user = "root";
        String password = "pwd";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, password, url);

        System.out.println("Connected to database successfully");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from mytable");
        rs.next();
        String name = rs.getString("name");

        con.close();
        System.out.println("Connection closed successfully");
    }
}
