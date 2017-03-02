package e74;
/**
 * @author nurulatiqahali
 *
 */
public class E74Age {
	int age;
	String name;
	
	 public int getAge() {
	        return this.age;
	    }

	public E74Age(String names) {
	//Pekka = names;
	name = names;
	this.age = 0;
	}

	public void printPerson() {
		//System.out.println(Pekka +" " +age +" years" );
		System.out.println(name +" " +age +" years" );
		
	}

	public void becomeOlder() {
		this.age++;; 
		
	}

}
