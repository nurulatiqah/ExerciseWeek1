package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72MoneyTransfer {
	
	private double num;
	private String account;
	
	public E72MoneyTransfer(String acc,double balances) {
		num = balances;
		account = acc;
		
	}
	
	public static void transfer(E72MoneyTransfer from, E72MoneyTransfer to, double howMuch){
		from.withdraw(howMuch);
		to.deposits(howMuch);
		
	}
	
	public double withdraw(double d) {
		num = num - d;
		return num;
	}

	public double deposits(double d) {
		num = num + d;
		return num;
	}

	public String toString() {

		return account + "" + num;
	}
	
}
