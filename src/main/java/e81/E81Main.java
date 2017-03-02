package e81;
/**
 * @author nurulatiqahali
 *
 */
public class E81Main {
	public static void main(String[] args) {
		E81Passwords randomizer = new E81Passwords(13);
		System.out.println("Password: " + randomizer.createPassword());
		System.out.println("Password: " + randomizer.createPassword());
		System.out.println("Password: " + randomizer.createPassword());
		System.out.println("Password: " + randomizer.createPassword());
	}
}
