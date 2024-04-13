import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter1 {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw =  new BufferedWriter(new FileWriter("C:\\Users\\DELL\\Documents\\File Handling\\Test.txt"));
		bw.write("This Is java Program.\n");
		bw.append("This is the append in java Program.");
		bw.close();
	}

}
