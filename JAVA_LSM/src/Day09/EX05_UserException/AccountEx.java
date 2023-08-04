package Day09.EX05_UserException;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 10000 입금
		account.deposit(10000);
		
		
		// 200000 출급
		try {
			account.withdraw(20000);
			
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}
}
