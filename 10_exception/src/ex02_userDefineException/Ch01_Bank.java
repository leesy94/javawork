package ex02_userDefineException;

public class Ch01_Bank {
	private int balance;
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws Ch01_userException {
		if(balance < money) {
			//System.out.println("잔액부족");
			throw new Ch01_userException("잔고부족 : "+ (money-balance));
		}else {
			balance -= money;
		}
	}
	
	public int getBalance() { //balance가 private니깐 사용
		return balance;
	}
}
