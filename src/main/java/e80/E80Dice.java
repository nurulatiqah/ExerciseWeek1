package e80;

import java.util.Random;

/**
 * @author nurulatiqahali
 *
 */
public class E80Dice {
	private Random random;
	private int numberOfSides;

	public E80Dice(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		random = new Random();
	}

	public int roll() {
		int prob = (int) (1 + random.nextInt(6));
		// 6 = print number from 1-6
		// prob = 1 + object.nextInt(numberOfSides);
		// from +object.nextInt(to-from +1);
		return prob;

	}
}
