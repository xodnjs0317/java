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
		return "������ :"+ShopName+"\n"+"��ǰ�� : " +ProductName+"\n"+"��ǰ���� : " +ProductPrice+"\n"+ "���ݿ�������ȣ : "+cashReceiptNumber;
		
	}
		
		
		

	@Override
	public void pay() throws PayException {
		if( ProductPrice<=0) {
			throw new PayException("������ �߸��Ǿ����ϴ�.");
		}
		
	}

}
