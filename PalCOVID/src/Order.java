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
	void showItems() {
		for(int i=0 ; i < items.size(); i++) {
			System.out.print(items.get(i).nameOfItem);
			System.out.print(" ");
			System.out.print(items.get(i).kindItem);
			System.out.print(" ");
			System.out.print(items.get(i).price);
		}
		System.out.println();
		System.out.println();
	}
	void removeItem(Item a) {
		
	}
	void setTotalPrice() {
		// call it when remove an item
	}
	
}
