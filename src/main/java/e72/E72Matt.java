package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72Matt {
	private double num;
	private String text;

	public E72Matt(String texts, double i) {
		text = texts;
		num = i;
	}

	public double withdraw(double d) {
		num = num - d;
		return num;
	}

	public double deposits(double d) {
		num = num + d;
		return num;
	}

	public String toString() {

		return text + "" + num;

	}
}
