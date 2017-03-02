package e78;

/**
 * @author nurulatiqahali
 *
 */
public class E78Bc {
	private int value;
	private int upperLimit;

	public E78Bc(int upperLimit) {
		value = 0;
		this.upperLimit = upperLimit;
	}

	public int getValue() {
		return value;
	}

	public void next() {
		value++;
		if (value > upperLimit) {
			value = 0; // advanced for minutes and hours
		}
	}

	public String toString() {
		return String.format("%02d", value);
	}

	// ________________________________________________________78.2
	// private int value;
	//
	// public E78Bc(int upperLimit) {
	// upperLimit = 14;
	// }
	//
	// public void next() {
	// if (value >= 0 && value <= 13) {
	// value++;
	// }else if(value>13){
	// value = 0;
	// }
	// }
	//
	// public String toString() {
	// return String.format( "%02d",value);
	// }
	// ______________________________________________________78.1
	// private int value;
	//
	// public E78Bc(int upperLimit) {
	// upperLimit = 4;
	// }
	//
	// public void next() {
	// if (value > 3) {
	// value = 0;
	// }else if(value>=0 || value<=4){
	// value++;
	// }
	// }
	//
	// public String toString() {
	// return "" + value;
	// }

}