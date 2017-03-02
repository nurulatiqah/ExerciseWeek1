package e82;

import java.util.ArrayList;

/**
 * @author nurulatiqahali
 *
 */
public class E82LotterryMain {
	public static void main(String[] args) {
		E82Lottery lotteryNumbers = new E82Lottery();
		ArrayList<Integer> numbers = lotteryNumbers.numbers();

		System.out.println("Lottery numbers:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println("");
	}
}
