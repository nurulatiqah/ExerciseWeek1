package e73;

/**
 * @author nurulatiqahali
 *
 */
public class E73Product {
	String nameAtStart;
	double amountAtStart;
	double priceAtStart;

	public E73Product(String Banana, double p, int a) {
		nameAtStart = Banana; // nameAtStart;
		priceAtStart = 1.1;
		amountAtStart = 13.0;
	}

	public void printProduct() { // initialized
		nameAtStart = "Glister";
		priceAtStart = 29.90;
		amountAtStart = 2;
	}

}