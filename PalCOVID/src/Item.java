
public class Item {
	public String kindItem;
	public String nameOfItem;
	private int count;
	public float price;
	
	public Item(String _1, String _2, int x, float y) {
		kindItem = _1;
		nameOfItem = _2;
		count =x;
		price = y;
	}
	int getCount() {
		return count;
	}
	String getName() {
		return nameOfItem;
	}
	String getKind() {
		return kindItem;
	}
	float getPrice() {
		return price;
	}
	
	void setCount(int x) {
		count = x;
	}
	void setName(String na) {
		nameOfItem = na;
	}
	void setPrice(float x) {
		price = x;
	}
	
	
	
}
