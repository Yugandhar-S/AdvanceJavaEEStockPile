package mypack;

public class LoginBean {

	public static Boolean Validate(String login, String password) {
		if(login.equalsIgnoreCase("Scott") && password.equals("tiger")) {
			return true;
		}
		else return false;
	}
}
