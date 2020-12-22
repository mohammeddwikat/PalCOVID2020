
public class Driver {
	private int phoneNumber;
	private String name;
	
	public Driver(int x, String y) {
		this.phoneNumber =x;
		this.name = y;
	}
	
	public void setName(String s) {
		name = s;
	}
	public void setPhoneNumber(int x) {
		phoneNumber = x;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public String getDriverName() {
		return name;
	}
	
}
