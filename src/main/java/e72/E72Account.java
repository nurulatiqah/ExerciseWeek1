package e72;
/**
 * @author nurulatiqahali
 *
 */
public class E72Account {

	private String texts;
	private double nums;

	public E72Account(String text, double num) {
		texts = text;
		nums = num;
	}

//	public String getTexts() {
//		return texts;
//	}
//
//	public void setTexts(String texts) {
//		this.texts = texts;
//	}

	public void withdrawal(int wthdrwl) {
		nums = nums - wthdrwl;

	}

	public void deposit(int dpst) {
		nums = nums + dpst;

	}

	public double balance() {

		return nums;
	}

	public String toString() {

		return texts + " " + nums;
	}

}
