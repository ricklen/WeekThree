package pw;

public class BasicChecker implements Checker {
	
	public static final String INITIAL = "JaapRick1";
	
	public boolean acceptable(String pass) {
		if (pass.length() > 6 && pass.indexOf(" ") == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public String generatePassword() {
		return INITIAL;
	}

}