package e81;
import java.util.Random;
/**
 * @author nurulatiqahali
 *
 */
public class E81Passwords {
	private Random random;
	private int numberOfLength;
	//private String character;

	public E81Passwords(int length) { //13-1

		numberOfLength = length;
		random = new Random();
	}

	public String createPassword() {
		String chrctrs = "";

		int number = 17;//17=r;

		for (int i = 1; i < numberOfLength; i++) {// i=number; 
			number = random.nextInt(25);

			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);//how you turn the integer number into a character:
			chrctrs = chrctrs + symbol;//chrctrs = 13;
		}

		return chrctrs;
	}
}
