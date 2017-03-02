package e77;

//Exercise 77.1 - 77.4
/**
 * @author nurulatiqahali
 *
 */
public class E77LyyraCard {

	private double balance;
	double dec = 2.50;
	double decG = 4.00;

	public E77LyyraCard(double balanceAtStart) {
		balance = balanceAtStart;
	}

	public void payEconomical() {
		// this.balance = this.balance - dec; 77.2
	}

	public void payGourmet() {
		// this.balance = this.balance - decG; 77.2
		if (balance >= decG) {
			balance -= decG;
		}
	}

	public String toString() {

		return "The card has " + this.balance + " euros";
	}

	public void loadMoney(double amount) {

		if (amount > 150) {
			balance = 150;
		} else if (amount <= 150) {
			balance = amount + balance;

		}

	}
}
