import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertionOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Email ID: ");
		String email = sc.nextLine();
		
		System.out.print("Enter the Password: ");
		String password = sc.nextLine();
		
		System.out.print("Enter the Gender: ");
		String gender = sc.nextLine();
		sc.close();
		
		//Register the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creating Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Mohit@123");
		
		//Create Statement
		//PreparedStatement ps = con.prepareStatement("insert into register values ('Dave','dave@gmail.com', 'dave123','Male')");
		
		//Creating positional parameters -> better way to write statements
		PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);

		//Execute Statement
		int p = ps.executeUpdate();
		if(p > 0)
		{
			 System.out.println("Success...");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//Close Connection
		con.close();
	}

}
