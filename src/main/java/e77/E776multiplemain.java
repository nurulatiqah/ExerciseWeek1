package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E776multiplemain {
	public static void main(String[] args) {
	        LyyraCard cardPekka = new LyyraCard(20);
	        LyyraCard cardBrian = new LyyraCard(30);
	        
	        cardPekka.payGourmet();
	        System.out.println(cardPekka);
	        cardBrian.payEconomical();
	        System.out.println(cardBrian);
	        cardPekka.loadMoney(20);
	        cardBrian.payGourmet();
	        System.out.println(cardPekka);
	        System.out.println(cardBrian);
	        cardPekka.payEconomical();
	        cardPekka.payEconomical();
	        cardBrian.loadMoney(50);
	        System.out.println(cardPekka);
	        System.out.println(cardBrian);
	    }
}
