package hotel;

public class TimedPassword extends Password {

//	private long createTime;
	private long validTime;		// validity duration in seconds
	private long createTime;
	
	public TimedPassword(long time) {
		createTime = System.currentTimeMillis();
		validTime = time;
	}
	
	public TimedPassword() {
		this(1000);
	}
	
	///// QUERIES ////////////
	public boolean isExpired() {
		return ((System.currentTimeMillis() - createTime) / 1000 > validTime);
	}

	///// METHODS ////////////
	public boolean setWord(String oldPass, String newPass) {
		if (super.setWord(oldPass, newPass)) {
		createTime = System.currentTimeMillis();
		return true;
		} else {
			return false;
		}
	}
	
// end class	
}
