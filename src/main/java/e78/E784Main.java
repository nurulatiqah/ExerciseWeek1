package e78;
import java.util.Scanner;
/**
 * @author nurulatiqahali
 *
 */
public class E784Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		E784BoundedCounter seconds = new E784BoundedCounter(59);
		E784BoundedCounter minutes = new E784BoundedCounter(59);
		E784BoundedCounter hours = new E784BoundedCounter(23);

		System.out.print("seconds: ");
		int s = scanner.nextInt();
		System.out.print("minutes: ");
		int m = scanner.nextInt();
		System.out.print("hours: ");
		int h = scanner.nextInt();

		seconds.setValue(s);
		minutes.setValue(m);
		hours.setValue(h);

		int i = 0;
		while (i < 121) {
			System.out.println(hours + ":" + minutes + ":" + seconds); // the current time
			Thread.sleep(1000);
			seconds.next(); // advance minutes
			if (seconds.getValue() == 0) {
				minutes.next();
			}
			if (minutes.getValue() == 0) {// if minutes become zero, advance
											// hours
				hours.next();
			}
			i++;
		}

	}
}
