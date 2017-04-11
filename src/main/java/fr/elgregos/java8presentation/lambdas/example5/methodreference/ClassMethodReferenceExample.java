package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class ClassMethodReferenceExample {

	public static void main(String... args) {
		String[] teamFirstName = new String []{"Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David", "Guillaume", "Antoine", "Gr�gory"};
				
		TeamFirstNameDisplayer.display(teamFirstName);
		
		// Appel de la m�thode compareTo de la classe String

		Arrays.sort(teamFirstName, (nom1, nom2) -> nom1.compareTo(nom2));
//		Arrays.sort(teamFirstName, String::compareTo);
		
		TeamFirstNameDisplayer.display(teamFirstName);
		
	}
}
