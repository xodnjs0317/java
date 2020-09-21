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
				
			"상점명 :"+ShopName+"\n"+"상품명 :"+ ProductName+"\n"+"상품가격 :"+ ProductPrice+"\n"+"신용카드번호 : "+ cardNumber+"\n"+"할부개월 : "+monthlyinstallment;
	
		
	}
	
	
	
	@Override
	public void pay() throws PayException {
		if(ProductPrice<0|monthlyinstallment<0) {
			throw new PayException("가격이나 할부 개월수가 잘못되었습니다.");
		}
		
		
	}
	
	

	
		
	
}
