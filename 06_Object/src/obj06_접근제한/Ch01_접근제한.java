package obj06_접근제한;

public class Ch01_접근제한 {
	private int balance ; //클래스 안에서 사용가능
	
	void deposit(int money) {
		balance += money ;
	}
	
	void withdraw(int money) {
		if(balance > money) {
			balance -= money ;
		}else {
			System.out.println("출금 할 수 없습니다!");
		}
	}
	int getBalance() { //변수에 있는 값 얻어오기
		return balance;
	}
	void setBalance(int bal) {
		this.balance = bal ;
	}
	
	
	
	//getter(변수의 값을 얻어 올 때)
	//setter(변수의 값을 넣을 때)
}
