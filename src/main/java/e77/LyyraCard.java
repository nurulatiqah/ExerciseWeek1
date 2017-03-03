package e77;

/**
 * @author nurulatiqahali
 *
 */
public class LyyraCard {
	double balance;
	double dec = 2.50;
	double decG = 4.00;

	public LyyraCard(double balanceAtStart) {
		balance = balanceAtStart;
	}

	public void payGourmet() {
		 if(balance>=decG){
				balance-=decG;
			}
	}

	public void payEconomical() {
		 if(balance>=dec){
			balance-=dec;
		}

	}

	public void loadMoney(int amount) {
		if (amount > 0) {
            balance += amount;
            if (balance > 150) {//maximum balance on a card is 150 euros
                balance = 150;
            }
        }		
	}

	public String toString() {

		return "The card has " + this.balance + " euros";
	}

}
