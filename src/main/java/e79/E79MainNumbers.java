package e79;
/**
 * @author nurulatiqahali
 *
 */
public class E79MainNumbers {
	private int amountOfNumbers;
	private int sum;
	private int average;

	public E79MainNumbers() {
		amountOfNumbers = 0;
		sum = 0;
		average = 0;
	}

	public void addNumber(int number) {
		sum += number;
		amountOfNumbers++;

	}

	public int amountOfNumbers() {
		return amountOfNumbers;

	}

	public int sum() {
		return sum;
	}

	public double average() {
		average = sum / amountOfNumbers;
		return average;
	}
}
