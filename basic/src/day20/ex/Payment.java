package day20.ex;

public abstract class Payment implements Payable{
 protected String ShopName;
 protected String ProductName;
 protected long ProductPrice;
 
 
 public void payment(String ShopName, String ProductName, long ProductPrice) {
	 	this.ShopName = ShopName;
		this.ProductName = ProductName;
		this.ProductPrice =ProductPrice;
 }
 
 
}
