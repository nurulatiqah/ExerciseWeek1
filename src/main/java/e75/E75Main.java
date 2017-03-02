package e75;

/**
 * @author nurulatiqahali
 *
 */
public class E75Main {
	public static void main(String[] args) {
		E75DecreasingCounter counter = new E75DecreasingCounter(100);// Exercise75.1=10;
																	// Exercise75.2=2;
		counter.printValue();

		counter.decrease();
		counter.printValue();
		counter.decrease();
		counter.printValue();

		counter.reset();
		counter.printValue();

		// counter.decrease();
		// counter.printValue(); 75.2

		counter.setInitial();
		counter.printValue();
	}
}
