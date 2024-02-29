
public class Podcast extends Audio{
	private String showName;
	private int epNum;
	public Podcast(String title, double duration, String showName, int epNum) {
		super(title, duration);
		this.showName = showName;
		this.epNum = epNum;
		
	}
	public String getShowName() {
		return this.showName;
	}
	public int getEpName() {
		return this.epNum;
	}
	public String toString() {
		return super.toString() + ", Show -" + this.getShowName() + " ep." + this.getEpName();
	}
	
}
