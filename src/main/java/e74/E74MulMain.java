package e74;

/**
 * @author nurulatiqahali
 *
 */
public class E74MulMain {
	public static void main(String[] args) {

		E74Multiplier threeMultiplier = new E74Multiplier(3);
		System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

		E74Multiplier fourMultiplier = new E74Multiplier(4);
		System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

		System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
		System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
	}
}
