package hotel;

public class Password {
	
	String password;
	public static final String INITIAL = "1234"; // initial password value
	
	
	public Password() {
		this.password = INITIAL; // capital letters because it's a constant ("final")
	}
	
	
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
