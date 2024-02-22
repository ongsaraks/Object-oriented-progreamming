
public class Member extends Product{
	private char MemberLevel;
	public Member(String name,double price,char MemberLevel) {
		super(name,price);
		this.MemberLevel = MemberLevel;
		System.out.println("MemberLevel is created...");
	}
	public void setMember(char M) {
		this.MemberLevel = M;
	}
	public char getMember() {
		return this.MemberLevel;
	}
	public boolean isMember(char M) {
		if(M == 'M'){
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return super.toString() + this.MemberLevel;
	}
	
	 
	
}
