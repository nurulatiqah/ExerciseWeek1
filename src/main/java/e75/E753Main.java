package e75;

public class E753Main {
	  public static void main(String[] args) {
		  DecreasingCounter counter = new DecreasingCounter(100);

	        counter.printValue();

	        counter.reset();
	        counter.printValue();

	        counter.decrease();
	        counter.printValue();
	    }
}
