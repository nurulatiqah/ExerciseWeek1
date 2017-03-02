package e82;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author nurulatiqahali
 *
 */
public class E82Lottery {
	private ArrayList<Integer> numbers;
	private Random random = new Random();

	public E82Lottery() {
		// We'll format a list for the numbers
		this.numbers = new ArrayList<Integer>();
		// Draw numbers as LotteryNumbers is created
		this.drawNumbers();

	}

	public ArrayList<Integer> numbers() {// returns the drawn numbers of this
											// draw
		return this.numbers;
	}

	public void drawNumbers() {// draws new numbers
		int n = 0;
		while (n < 7) {
			int number = 1 + random.nextInt(39);// 39-1+1
			if (!containsNumber(number)) {
				numbers.add(number);
				n++;
			}
		}

	}

	public boolean containsNumber(int number) {// is among the drawn numbers or not
		if (!numbers.contains(number)) {
			return false;
		} else {
			return true;
		}

		// Test here if the number is already among the drawn numbers
	}
}
