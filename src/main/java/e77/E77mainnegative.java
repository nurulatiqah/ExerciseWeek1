package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E77mainnegative {
	public static void main(String[] args) {
		E77mainnegativeLC card = new E77mainnegativeLC(10);
		System.out.println("Pekka: " + card);
		card.loadMoney(-15);
		System.out.println("Pekka: " + card);
	}
}
