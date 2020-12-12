import java.util.*;
import java.time.*;

public class Order {
	public ArrayList <SaledItem> items ;
	public String storeName;
	public String addressDeliver;
	public String timePlaced;
	public String PaymentInformation;
	public int pointGained;
	public float totalPrice;
	public int phoneNumber;
	
	public Order() {
		
	}
	public void showDetails() {
		System.out.println(storeName);
		System.out.println(phoneNumber);
		System.out.println(addressDeliver);
		System.out.println(timePlaced);
		System.out.println(PaymentInformation);
		System.out.println(pointGained);
		System.out.println(totalPrice);
	}
	public void showItems() {
		for(int i=0 ; i < items.size(); i++) {
			items.get(i).showDetails();
		}
	}
	void removeItem(SaledItem a) {
		for(int i=0 ; i < items.size(); i++) {
			if(items.get(i).equals(a)) {
				items.remove(i);
				setTotalPrice(totalPrice - (a.countSaled*a.price));
				break;
			}
		}
	}
	void setTotalPrice(float x) {
		// call it when remove an item
		totalPrice = x;
	}
	
}
