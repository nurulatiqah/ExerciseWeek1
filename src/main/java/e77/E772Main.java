package e77;

//Exercise 77.1 - 77.4
/**
 * @author nurulatiqahali
 *
 */
public class E772Main {
	public static void main(String[] args) {
		LyyraCard card = new LyyraCard(50);
		System.out.println(card);

		card.payEconomical();
		System.out.println(card);

		card.payGourmet();
		card.payEconomical();
		System.out.println(card);

	}

}
