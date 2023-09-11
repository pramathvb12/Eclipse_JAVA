
public class Main {

	public static void main(String[] args) {
		Idandpassword idpass = new Idandpassword();

		LoginPage loginpage = new LoginPage(idpass.getLoginInfo());
	}

}
