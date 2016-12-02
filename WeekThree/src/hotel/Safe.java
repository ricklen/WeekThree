package hotel;

public class Safe {
	
//	/*@ 	private invariant pass.password != "" && pass.password != null;
//	 		public invariant isActive == true || isActive == false;
//			public invariant isOpen == true || isOpen == false;
//	 */

	Password pass;
	public boolean isActive;
	public boolean isOpen;

	// Constructor for the Safe Class with initial password
	// @ requires password.indexOf(" ") == -1;
	////@ requires password.length() > 14;
	public Safe(String password) {
		pass = new Password();
		String initial = Password.INITIAL;
		pass.setWord(initial, password);
		isOpen = false;
	}
	
	//@ ensures \result == isActive; 
	//@ pure
	public boolean getActive() {
		return this.isActive;
	}
	
	//@ ensures \result == isOpen;
	//@ pure
	public boolean getOpen() {
		return this.isOpen;
	}
	
	// Method "activate" works if: 1. Password correct. 2. Safe not active yet (!= active->!active)
	public boolean activate(String password) {
		if (pass.testWord(password) && !isActive) {
			isActive = true;
			return true;
		} else {
			return false;
		}
	}
	
	// Method "deactivate" works if: 1. Safe active. NB: This method also closes the safe!
	public boolean deactivate() {
		if (isActive) {
			isActive = false;
			isOpen = false;
			return true;
		} else {
			return false;
		}
	}
	
	// Method "open" works if: 1. Password correct. 2. Safe not open yet (!isOpen)
	public boolean open(String password) {
		if (isActive && !isOpen && pass.testWord(password)) {
			isOpen = true;
			return true;
		} else {
			return false;
		}
	}
	
	// Method "close" closes opened safe.
	public boolean close() {
		if (isOpen) {
			isOpen = false;
			return true;
		} else {
			return false;
		}
	}
	
	public Password getPassword() {
		return this.pass;
	}
	
	
}
