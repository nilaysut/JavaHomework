package youtubeEgitim;

public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;

	}
	
	public void Save() {
		System.out.println("Müşteri Kaydedildi : ");
		
	}
	
	public void Delete() {
		System.out.println("Müşteri Silindi : ");
		
	}
	public void GiveCredit() {
		
	}

}
