package ex02_userDefineException;

public class Ch01_Bank_Main {

	public static void main(String[] args) {
		Ch01_Bank bank = new Ch01_Bank();
		
		bank.deposit(1000000);
		
		try {
			bank.withdraw(300000);
			bank.withdraw(300000);
		} catch (Ch01_userException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("현재 잔액 : "+ bank.getBalance());
	}

}
