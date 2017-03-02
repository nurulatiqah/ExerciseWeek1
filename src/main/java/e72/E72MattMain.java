package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72MattMain {
	public static void main(String[] args) {
		E72Matt Matts = new E72Matt("Mat Accounts: ", 1000);
		E72Matt MyAcc = new E72Matt("My Accounts: ", 0);
		Matts.withdraw(100.0);
		System.out.println(Matts);
		MyAcc.deposits(100.0);
		System.out.println(MyAcc);
		System.out.println(Matts);
		System.out.println(MyAcc);

	}
}
