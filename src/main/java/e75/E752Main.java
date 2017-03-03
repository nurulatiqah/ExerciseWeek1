package e75;

/**
 * @author nurulatiqahali
 *
 */
public class E752Main {
	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(2);
																	
		counter.printValue();

		counter.decrease();
		counter.printValue();
		counter.decrease();
		counter.printValue();

		 counter.decrease();
		 counter.printValue(); 
	}
}