import java.util.*;
public class Store {
	
	public String name;
	public String email;
	public String typeStore;
	public ArrayList <Item> items;
	private ArrayList <Order> orders;
	private ArrayList <DeliveryRecord> records;
	
	public Store(String _1,String _2,String _3 ) {
		name = _1;
		email = _2;
		typeStore = _3;
	}
	
	public void addItem(Item e) {
		items.add(e);
	}
	
	public void removeItem(Item o) {
		if(items.isEmpty())
			return;
		items.remove(o);
	}
	
	public void updateItem(Item t, String s) {
		if(s.equals("Name")) {
			for(int i=0; i < items.size(); i++) {
				if(t.equals(items.get(i))) {
					items.get(i).setName(s);
					break;
				}
			}
		}else {
			for(int i=0; i < items.size(); i++) {
				if(t.equals(items.get(i))) {
					items.get(i).setName(s);
					break;
				}
			}
		}
	}
	
	public void updateItem(Item t, int x) {
		for(int i=0; i < items.size(); i++) {
			if(t.equals(items.get(i))) {
				items.get(i).setCount(x);
				break;
			}
		}
	}
	
	public void updateItem(Item t, float x) {
		for(int i=0; i < items.size(); i++) {
			if(t.equals(items.get(i))) {
				items.get(i).setPrice(x);
				break;
			}
		}
	}
	
	public void showOrders() {
		for(int i=0; i < orders.size(); i++) {
			orders.get(i).showDetails();
			orders.get(i).showItems();
		}
	}
	public void createDeliveryRecord (Customer c, String time, Driver d, Order o) {
		DeliveryRecord deliveryRecord = new DeliveryRecord(d.getDriverName(), d.getPhoneNumber(), time, DeliveryCompany.getInstance("Careem", 597444141), c, o );
		records.add(deliveryRecord);
	}
	
}
/*
 * driverName = _1;
		phoneNumber = x;
		timeOrderDeliverd = _2;
		deCo = dc;
		customer = cus;
		order = o;
  */
 