
public class Legal extends Product{
	String legal;
	public Legal(String name, double price, String Legal){
		super(name,price);
		this.legal = Legal;
		System.out.println("Legal product is created ...");
	}
	public void setLegal(String Legal) {
		this.legal = Legal;
	}
	public String getLegal() {
		return this.legal;
	}
	public boolean isLegal(String Legal) {
		if(Legal == "Yes") {
			return true;
		}
		return false;
	}
}
