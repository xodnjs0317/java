package day20.ex;

public class CashPayment extends Payment{
		private String cashReceiptNumber; 
		
		
		public CashPayment(String ShopName, String ProductName, long ProductPrice, String cashReceiptNumber) {
			this.ShopName =ShopName;
			this.ProductName= ProductName;
			this.ProductPrice= ProductPrice;
			this.cashReceiptNumber = cashReceiptNumber;
		}

	@Override
	public String toString() {
		return "상점명 :"+ShopName+"\n"+"상품명 : " +ProductName+"\n"+"상품가격 : " +ProductPrice+"\n"+ "현금영수증번호 : "+cashReceiptNumber;
		
	}
		
		
		

	@Override
	public void pay() throws PayException {
		if( ProductPrice<=0) {
			throw new PayException("가격이 잘못되었습니다.");
		}
		
	}

}
