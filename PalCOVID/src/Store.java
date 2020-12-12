import java.util.*;
public class Store {
	
	public	String name;
	public String email;
	public String typeStore;
	public ArrayList <Item> items;
	private ArrayList <Order> orders;
	public ArrayList <DeliveryCompany> delivareyCompanies;
	
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
		
	}
	//add + remove delivery company
	public void createDeliveryRecord() {
		
	}
	
	
}
