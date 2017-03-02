package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72Main {
	public static void main(String[] args) {
		E72Account bartosAccount = new E72Account("Barto's account", 100.00);
		E72Account bartosSwissAccount = new E72Account("Barto's account in Switzerland", 1000000.00);

		System.out.println("Initial state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);

		bartosAccount.withdrawal(20);
		System.out.println("Barto's account balance is now: " + bartosAccount.balance());
		bartosSwissAccount.deposit(200);
		System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

		System.out.println("Final state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);
	}
}
