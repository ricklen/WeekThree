package hotel;

public class TimedPassword extends Password {
	
//	private long createTime;
	private long validTime;		// validity duration in seconds
	
	public TimedPassword(long time) {
		validTime = time;
	}
	
	public TimedPassword() {
		this(1000);
	}
	
	///// QUERIES ////////////
	public boolean isExpired() {
		return ((System.currentTimeMillis() - super.getCreateTime()) / 1000 > validTime);
	}

	
	
// end class	
}
