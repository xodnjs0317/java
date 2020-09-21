package day12;

public class Account {
	
	private	int MIN_BALANCE = 0;
	private	int MAX_BALANCE = 1000000;
	
	
	int Balance;
	
	
	
	public int getBalance() {
	
		return Balance;
	}
	public void setBalance(int Balance) {
	
		if(MAX_BALANCE<Balance) {
	}else if(MIN_BALANCE>Balance) {
	}else { this.Balance =Balance;
		
	}
	
	

}
}