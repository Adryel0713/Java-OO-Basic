package fixacao2;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0.0;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withDraw(double withdraw) {
		balance = balance - withdraw - 5.00;
	}
	
	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
