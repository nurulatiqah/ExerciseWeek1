package e74;

/**
 * @author nurulatiqahali
 *
 */
public class E74Main {

	public static void main(String[] args) {
		E74Age pekka = new E74Age("Pekka");
		E74Age andrew = new E74Age("Andrew");

		pekka.printPerson();
		andrew.printPerson();

		System.out.println("");

		pekka.becomeOlder();
		pekka.becomeOlder();
		andrew.becomeOlder();
		andrew.becomeOlder();

		System.out.println("Age of Pekka: " + pekka.getAge());
		System.out.println("Age of Andrew: " + andrew.getAge());

		int total = pekka.getAge() + andrew.getAge();

		System.out.println("Pekka and Andrew total of " + total + " years old");

	}
}
