package e75;
/**
 * @author nurulatiqahali
 *
 */
public class DecreasingCounter {
	private int value;

	public DecreasingCounter(int valueAtStart) {
		value = valueAtStart;

	}

	public void printValue() {
		System.out.println("value: " +value);

	}

	public void decrease() {


		if (value > 0) {
			value--;
		} else
			value = 0;
	}

	public void reset() {
		value = 0; 
	}

	public void setInitial() {
		value = 100;
	}
}
