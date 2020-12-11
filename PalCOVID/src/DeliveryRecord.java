
public class DeliveryRecord {
	public String driverName;
	public int phoneNumber;
	public String timeOrderDeliverd;
	
	public DeliveryRecord(String _1, int x, String _2) {
		driverName = _1;
		phoneNumber = x;
		timeOrderDeliverd = _2;
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
