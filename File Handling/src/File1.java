import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\DELL\\Documents\\File Handling\\Demo.txt");
		boolean fileCreated = f.createNewFile();
		if(fileCreated)
		{
			System.out.println("File created Successfully...");
		}
		else
		{
			System.out.println("File is not Created...");
		}
		
		System.out.println("The file Name: "+f.getName());
		
		boolean isDeleted = f.delete(); if(isDeleted) 
		{
	         System.out.println("File Deleted Successfully..."); 
	    } 
		else
		{
	         System.out.println("File not deleted..."); 
	    }
	}
}
