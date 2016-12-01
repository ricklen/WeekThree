package hotel;

import pw.*;

public class Password {
	
	private long createTime;
	
	private String password;
	private Checker checker;
	private String factoryPassword;
	
	public static final String INITIAL = "JaapRick1"; // initial password value
	
	
	public Password(Checker check) {
		createTime = System.currentTimeMillis();
		password = INITIAL; // capital letters because it's a constant ("final")
		factoryPassword = INITIAL;
		checker = check;
	}
	
	public Password() {
		this(new BasicChecker());		
	}
	
	///// QUERIES ////////////
	
	public String getFactoryPassword() {
		return factoryPassword;
	}
	
	public Checker getChecker() {
		return checker;
	}

	
	////// METHODS ////////////
	
	// Checks for acceptable password strength (checks: no spaces in String (index spaces == -1)
	// 												&& sufficient length (> 3) )
	public boolean acceptable(String suggestion) {
		if (suggestion.indexOf(" ") == -1 && suggestion.length() > 3) {	
			return true;
		} else {
			return false;
		}
	}
	
	
	// Setting a new password. oldPass has to be correct & newPass must be acceptable (2 cond.).
	public boolean setWord(String oldPass, String newPass) {
		if (oldPass.equals(password) && acceptable(newPass)) {
			password = newPass;
			return true;
		} else {
			return false;
		}
	}
		
	// Test if input "test" matches password
	public boolean testWord(String test) {
		return test.equals(password);
	}

	
	public String toString() {
		return password;
	}
	    

}	// class end
