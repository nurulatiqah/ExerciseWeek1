package e77;
//Exercise 77.1 - 77.4
/**
 * @author nurulatiqahali
 *
 */
public class E774Main {
	public static void main(String[] args) {
		LyyraCard card = new LyyraCard(10);
		System.out.println(card);

		card.loadMoney(15);
		System.out.println(card);

		card.loadMoney(10);
		System.out.println(card);

		card.loadMoney(200);
		System.out.println(card);
	}

}
