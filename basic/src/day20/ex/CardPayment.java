package day20.ex;

public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyinstallment;
	
	public CardPayment(String ShopName, String ProductName, long ProductPrice, String cardNumber, String cardPassword, int monthlyinstallment) {
		this.ShopName =ShopName;
		this.ProductName= ProductName;
		this.ProductPrice= ProductPrice;
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyinstallment = monthlyinstallment;
	}
	@Override
	public String toString( ) {
		return 
				
			"������ :"+ShopName+"\n"+"��ǰ�� :"+ ProductName+"\n"+"��ǰ���� :"+ ProductPrice+"\n"+"�ſ�ī���ȣ : "+ cardNumber+"\n"+"�Һΰ��� : "+monthlyinstallment;
	
		
	}
	
	
	
	@Override
	public void pay() throws PayException {
		if(ProductPrice<0|monthlyinstallment<0) {
			throw new PayException("�����̳� �Һ� �������� �߸��Ǿ����ϴ�.");
		}
		
		
	}
	
	

	
		
	
}
