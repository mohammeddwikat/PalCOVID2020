
public class DeliveryCompany {
	private String name;
	private int phoneNumber;
	private volatile static DeliveryCompany uniqueInstance;
	
	private DeliveryCompany(String _1, int x) {
		this.name = _1;
		this.phoneNumber = x ;
	}
	
	public static DeliveryCompany getInstance(String name, int number) {
		if(uniqueInstance == null) {
			synchronized (DeliveryCompany.class){
				if(uniqueInstance == null) {
					uniqueInstance = new DeliveryCompany(name, number);
				}
			}
		}
		return uniqueInstance;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setPhoneNumber(int n) {
		phoneNumber = n;
	}
	public String getName() {
		return name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
}
