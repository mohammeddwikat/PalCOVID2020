
public class DeliveryRecord {
	private String driverName;
	private int phoneNumber;
	private String timeOrderDeliverd;
	private DeliveryCompany deCo;
	private Customer customer;
	private Order order;
	
	public DeliveryRecord(String _1, int x, String _2, DeliveryCompany dc, Customer cus) {
		driverName = _1;
		phoneNumber = x;
		timeOrderDeliverd = _2;
		deCo = dc;
		customer = cus;
	}
	
	public void setDriverName(String a) {
		driverName = a;
	}
	
	public void setphoneNumber(int n) {
		phoneNumber = n;
	}
	
	public void setTimeDeliverd(String g) {
		timeOrderDeliverd = g;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getTimeOrderDeliverd() {
		return timeOrderDeliverd;
	}
	
	
}
