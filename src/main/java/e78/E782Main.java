package e78;

public class E782Main {
	public static void main(String[] args) {
		BoundedCounter counter = new BoundedCounter(14);
		 System.out.println("Value at start: " + counter);
		
		 int i = 0;
		 while (i < 16) {
		 counter.next();
		 System.out.println("Value: " + counter);
		 i++;
		 }
	}
}
