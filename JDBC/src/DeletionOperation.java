import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DeletionOperation {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		sc.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mohit@123");
		
		PreparedStatement ps = con.prepareStatement("delete from register where name=?");
		ps.setString(1, name);
		int count = ps.executeUpdate();
		if(count > 0)
		{
			System.out.println("Delete Successfully");
		}
		else
		{
			System.out.println("Delete Failed");
		}
		con.close();
	}

}
