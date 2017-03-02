package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E77mainnegativeLC {

	private double balance;

	public E77mainnegativeLC(double balanceAtStart) {
		balance = balanceAtStart;
	}

	public void loadMoney(double amount) {

		if (amount < 0) {
			this.balance = balance;
		} else {
			balance = amount + balance;
		}
	}

	public String toString() {

		return "The card has " + this.balance + " euros";
	}

}
