package Sixth;

class Login {
	String userId = "Ajay", password = "password";

	public String loginUser(String user, String pass) {
		if (user.equals(userId) && pass.equals(password)) {
			return "Welcome " + user;
		}
		else {
		return "";
		}
	}
}