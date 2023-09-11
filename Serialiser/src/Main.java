import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		user u = new user();
		u.name = "bro";
		u.password = "thor<&";
			
		FileOutputStream fileout = new FileOutputStream("Userifo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(u);
		out.close();
		fileout.close();
		System.out.println("obj ifo saved!!!");
	}

}
