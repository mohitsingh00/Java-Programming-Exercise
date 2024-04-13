import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdationOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the gender: ");
		String email = sc.nextLine();
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		sc.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mohit@123");
		
		PreparedStatement ps = con.prepareStatement("update register set gender=? where name=? ");
		ps.setString(1, email);
		ps.setString(2, name);
		int count = ps.executeUpdate();
		if(count > 0)
		{
			System.out.println("Update Successfully");
		}
		else
		{
			System.out.println("Update Failed");
		}
		con.close();
	}

}
