package pw;

public class StrongChecker extends BasicChecker {
	
	public static final String INITIAL = "JaapRick1";
	
	public boolean acceptable(String pass) {
		if (super.acceptable(pass) && Character.isLetter(pass.charAt(0))
				&& Character.isDigit(pass.charAt(pass.length() - 1))) {
			return true;
		} else {
			return false;
		}
	}
	
	public String generatePassword() {
		return INITIAL;
	}
	

}
