package e78;

/**
 * @author nurulatiqahali
 *
 */
public class E783Main {
	public static void main(String[] args) {

		BoundedCounter minutes = new BoundedCounter(59);
		BoundedCounter hours = new BoundedCounter(23);

		int i = 0;
		while (i < 121) {
			System.out.println(hours + ":" + minutes); // the current time
			minutes.next(); // advance minutes
			if (minutes.getValue() == 0) {// if minutes become zero, advance
											// hours
				hours.next();
			}
			i++;
		}

	}

}
