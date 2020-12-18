
public class DeliveryRecord {
	private String driverName;
	private int phoneNumber;
	private String timeOrderDeliverd;
	private DeliveryCompany deCo;
	private Customer customer;
	private Order order;
	
	public DeliveryRecord(String _1, int x, String _2, DeliveryCompany dc, Customer cus, Order o) {
		driverName = _1;
		phoneNumber = x;
		timeOrderDeliverd = _2;
		deCo = dc;
		customer = cus;
		order = o;
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
	public void setCustomer(Customer cus) {
		customer = cus;
	}
	public void setDeliveryCompany(DeliveryCompany dc) {
		deCo = dc;
	}
	public void setOrder(Order o) {
		order = o;
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
	public DeliveryCompany getDeliveryCompany() {
		return deCo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Order getOrder() {
		return order;
	}
}
