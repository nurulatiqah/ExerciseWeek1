package e76;

/**
 * @author nurulatiqahali
 * For 76.2 and 76.3 
 */
public class E762Main {
	public static void main(String[] args) {

		PrintMeal menu = new PrintMeal();
		menu.addMeal("Hamburger");
		menu.addMeal("Sauerkraut");
		menu.addMeal("Sauerkraut");
		menu.addMeal("Fish n chip");
		menu.clearMenu(); //clear menu
		menu.printMeals();

	}

}
