package e78;
/**
 * @author nurulatiqahali
 *
 */
public class E78MainBC {
	public static void main(String[] args) {

		E78Bc minutes = new E78Bc(59);
		E78Bc hours = new E78Bc(23);

		int i = 0;
		while (i < 121) {
			System.out.println(hours + ":" + minutes); // the current time
			minutes.next(); // advance minutes
			if (minutes.getValue() == 0) {// if minutes become zero, advance
											// hours
				hours.next();
			}
			i++;
		}

	}

	// ___________________________________________________78.1
	// E78Bc counter = new E78Bc(4);
	// System.out.println("Value at start: " + counter);
	//
	// int i = 0;
	// while (i < 10) {
	// counter.next();
	// System.out.println("Value: " + counter);
	// i++;
	// }

	// ___________________________________________________78.2
	// E78Bc counter = new E78Bc(14);
	// System.out.println("Value at start: " + counter);
	//
	// int i = 0;
	// while (i < 16) {
	// counter.next();
	// System.out.println("Value: " + counter);
	// i++;
	// }
}
