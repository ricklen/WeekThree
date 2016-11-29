package pw;

public class BasicChecker implements Checker{
	
	public boolean acceptable(String pass){
		if (pass.length() < 4 || pass.indexOf(" ") != -1) {
			return false;
		}
		else return true;
	}

}
