package e77;
//Exercise 77.1 - 77.4
/**
 * @author nurulatiqahali
 *
 */
public class E77Main {
	public static void main(String[] args) {
		E77LyyraCard card = new E77LyyraCard(10);
		System.out.println(card);

		// card.payGourmet();
		// card.payEconomical(); 77.2
		card.loadMoney(15);
		System.out.println(card);

		// card.payGourmet();
		// card.payEconomical(); 77.2
		card.loadMoney(10);
		System.out.println(card);

		card.loadMoney(200);
		System.out.println(card);
	}

}
