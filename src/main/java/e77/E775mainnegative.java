package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E775mainnegative {
	public static void main(String[] args) {
		LyyraCard card = new LyyraCard(10);
		System.out.println("Pekka: " + card);
		card.loadMoney(-15);
		System.out.println("Pekka: " + card);
	}
}
