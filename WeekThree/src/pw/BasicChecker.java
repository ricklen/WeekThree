package pw;

public class BasicChecker implements Checker {
	
	public static final String INITIAL = "JaapRick1";
	
	public boolean acceptable(String pass) {
		return pass.length() > 6 && pass.indexOf(" ") == -1;
	}
	
	public String generatePassword() {
		return INITIAL;
	}

}
