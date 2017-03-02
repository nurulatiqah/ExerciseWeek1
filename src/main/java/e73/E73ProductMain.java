package e73;

/**
 * @author nurulatiqahali
 *
 */
public class E73ProductMain {
	public static void main(String[] args) {

		E73Product products = new E73Product("Banana", 1.1, 13);

		System.out.println("Products " + products.nameAtStart + " Amount " + products.amountAtStart + " Price "
				+ products.priceAtStart);
		System.out.println(" ");
		products.printProduct();
		System.out.println("Products " + products.nameAtStart + " Amount " + products.amountAtStart + " Price "
				+ products.priceAtStart);
	}
}
