package e77;

/**
 * @author nurulatiqahali
 *
 */
public class E77multiplemain {
	public static void main(String[] args) {
	        E77multiplecard cardPekka = new E77multiplecard(20);
	        E77multiplecard cardBrian = new E77multiplecard(30);
	        
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
