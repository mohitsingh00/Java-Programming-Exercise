import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mohit@123");
		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println("Name: "+rs.getString("name"));
			System.out.println("Email ID: "+rs.getString("email"));
			System.out.println("Password: "+rs.getString("password"));
			System.out.println("Gender: "+rs.getString("gender"));
			System.out.println("-----------------------------------------");
		}
		con.close();
	}

}
