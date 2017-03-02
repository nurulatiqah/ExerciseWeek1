package e74;

/**
 * @author nurulatiqahali
 *
 */
public class E74Multiplier {

	int numbers;
	int otherNumber;

	public E74Multiplier(int number) {
		this.numbers = number;
	}

	public int multiply(int otherNum) {
		this.otherNumber = otherNum;
		int total = this.numbers * this.otherNumber;
		return total;
	}

}
