package e75;
/**
 * @author nurulatiqahali
 *
 */
public class E75DecreasingCounter {
	private int value;

	public E75DecreasingCounter(int valueAtStart) {
		value = valueAtStart;

	}

	public void printValue() {
		System.out.println("value: " +value);

	}

	public void decrease() {

		// 75.1 value--;

		if (value > 0) {
			value--;
		} else
			value = 0;
	} // 75.3

	public void reset() {
		value = 0; // 75.3
	}

	public void setInitial() {
		value = 100;
	}
}
