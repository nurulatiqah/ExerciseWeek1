package e71;
import java.util.ArrayList;
/**
 * @author nurulatiqahali
 *
 */
public class E71 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);
		list2.add(3);
		list2.add(10);
		list2.add(7);

		System.out.println("list1 :-" + list1);
		System.out.println("list2 :-" + list2);
		smartCombine(list1, list2);
		System.out.println(list1);

	}
	//combine if still not in the list
	/**
	 * @param first
	 * @param second
	 */
	public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
		for (int x : second) {
			while (!first.contains(x)) {
				first.add(x);
			}
		}
	}

}
