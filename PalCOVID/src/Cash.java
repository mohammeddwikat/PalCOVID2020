
public class Cash implements PaymentSystem  {

	@Override
	public void paidBehavior() {
		// TODO Auto-generated method stub
		System.out.println("You will paid cash");
		
	}

	@Override
	public boolean checkValidity() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkBudget() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void makeDiscount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeDeliveryFree() {
		// TODO Auto-generated method stub
		
	}

}
