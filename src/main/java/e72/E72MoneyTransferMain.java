package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72MoneyTransferMain {
	public static void main(String[] args) {
		E72MoneyTransfer a = new E72MoneyTransfer("A ", 100.00);
		E72MoneyTransfer b = new E72MoneyTransfer("B ", 0.0);
		E72MoneyTransfer c = new E72MoneyTransfer("C ", 0.0);
		E72MoneyTransfer.transfer(a, b, 50.0);
		E72MoneyTransfer.transfer(b, c, 25.0);
		System.out.println("The balance on Account "  +a);
		System.out.println("The balance on Account "  +b);
		System.out.println("The balance on Account "  +c);
	}

}
