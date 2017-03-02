package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E77multiplecard {
	double balance;
	double dec = 2.50;
	double decG = 4.00;

	public E77multiplecard(double balanceAtStart) {
		balance = balanceAtStart;
	}

	public void payGourmet() {
		balance = balance - decG;
	}

	public void payEconomical() {
		balance = balance - dec;

	}

	public void loadMoney(int amount) {
		balance = balance + amount;
	}

	public String toString() {

		return "The card has " + this.balance + " euros";
	}

}
