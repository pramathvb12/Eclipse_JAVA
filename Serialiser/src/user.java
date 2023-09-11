import java.io.Serializable;

public class user implements Serializable {
	String name;
	String password;
	
	public void display() {
		System.out.println("Hii !!! "+name);
	}
}
