package e79;
import java.util.Scanner;
/**
 * @author nurulatiqahali
 *
 */
public class E79Main {
	public static void main(String[] args) {
		E79MainNumbers stats = new E79MainNumbers();
		E79MainNumbers evens = new E79MainNumbers();
		E79MainNumbers odds = new E79MainNumbers();
		// stats.addNumber(3);
		// stats.addNumber(5);
		// stats.addNumber(1);
		// stats.addNumber(2);
		// System.out.println("Amount: " + stats.amountOfNumbers());
		// System.out.println("sum: " + stats.sum());
		// System.out.println("average: " + stats.average());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");

		while (true) {

			int num = scanner.nextInt();
			if (num > 0) {
				stats.addNumber(num);
			} else if (num < 0) {
				System.out.println();
				break;
			}

			if (num % 2 == 0) {
				evens.addNumber(num);

			}

			if (num % 2 == 1) {
				odds.addNumber(num);

			}
		}
		System.out.println("sum: " + stats.sum());
		System.out.println("sum of even: " + evens.sum());
		System.out.println("sum of odd: " + odds.sum());
	}
}
