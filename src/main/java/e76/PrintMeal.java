package e76;

import java.util.ArrayList;

/**
 * @author nurulatiqahali
 *
 */
public class PrintMeal {

	private ArrayList<String> meals;

	public PrintMeal() {
		this.meals = new ArrayList<String>();

	}

	public void addMeal(String meal) {
		while (!meals.contains(meal)) {
			meals.add(meal);
		}
	}

	public void printMeals() {
		for (String mealA : meals) {
			System.out.println(mealA);
		}
	}

	public void clearMenu() {
		meals.remove("Hamburger");
	}

}
