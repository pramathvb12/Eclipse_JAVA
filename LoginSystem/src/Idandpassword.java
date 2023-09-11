import java.util.HashMap;

public class Idandpassword {
	HashMap <String,String> login = new HashMap <String,String>();
	Idandpassword(){
		login.put("Bro", "code");
		login.put("thor", "love");
		login.put("Admin", "PASSWORD");
	}
	protected HashMap getLoginInfo(){
		return login;
	}

}
