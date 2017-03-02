package e80;

/**
 * @author nurulatiqahali
 *
 */
public class E80Main {
	public static void main(String[] args) {
		E80Dice dice = new E80Dice(6);
		int i = 0;
		while (i < 10) {
			System.out.println(dice.roll());
			i++;
		}
	}
}
